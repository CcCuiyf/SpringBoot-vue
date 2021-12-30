<template>
  <div class="logincontainer" style="margin-top:10vh">
    <el-form :model="form" class="loginForm" ref="loginForm" :inline="false" size="normal">
      <el-form-item >
        <dir class="loginTitle">
          系统登陆
        </dir>
      </el-form-item>
      
      <el-form-item prop="resource">
        <dir>身份</dir>
      <el-radio-group v-model="form.resource">
        <el-radio label="学生" value='student'/>
        <el-radio label="leader" value='leader'> </el-radio>
        <el-radio label="管理员" value='administrator'/>
      </el-radio-group>
    </el-form-item>
      <el-form-item prop="username">
        用户名
        <el-input v-model="form.username" placeholder="请输入用户名"/>
      </el-form-item>
      <el-form-item prop="password">
        密码
        <el-input type="password" v-model="form.password" placeholder="请输入密码"/>
      </el-form-item>
      <el-form-item>
        <el-row :gutter="20">
          <el-col :span="12" :offset="0">
            <el-button class="btn" type="primary" @click="onSubmit">登录</el-button>
          </el-col>
          <el-col :span="12" :offset="0">
            <el-button class="btn" >注册</el-button>
          </el-col>
        </el-row>
      </el-form-item>
    </el-form>
    
  </div>
</template>

<script>


  import {Axios as request} from "axios";

  export default {
    name:'index',
    components :{
     

    },
    methods:{
      onSubmit() {
        request.post("/login", "/{this.form}").then(res => {
          if (res.code === '0') {
            this.$messageBox({
              type: "success",
              message: "登录成功"
            })
            // sessionStorage.setItem("user", JSON.stringify(res.data))  // 缓存用户信息
            //
            // // 登录成功的时候更新当前路由
            // activeRouter()
            // this.$router.push("/")  //登录成功之后进行页面的跳转，跳转到主页

          } else {
            this.$messageBox({
              type: "error",
              message: res.msg
            })
          }

        })
      },
      data(){
        return{
          form:{
            username:'',
            password:'',
            resource:'',
          }
        }
      }
      }

  }
</script>

<style  scoped>
.logincontainer{
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.loginForm{
  height: 450px;
  width: 400px;
  box-shadow: 0 0 25px #cac6c6;
  border-radius: 10px;
  padding: 20px 30px;
}
.loginTitle{
  font-size: 24px;
  font-weight: 600;
  display: flex;
  align-items: center;
  justify-content: center;
}
.btn{
  width: 100%;
}
</style>