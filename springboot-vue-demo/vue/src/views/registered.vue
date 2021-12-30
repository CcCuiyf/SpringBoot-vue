<template>
    <div class="registeredcontainer">
        <el-form
                :model="registeredForm"
                class="registeredForm"
                ref="registeredForm"
                :inline="false"
                size="normal"
        >
            <el-form-item>
                <dir class="registeredTitle">用户注册</dir>
            </el-form-item>

            <el-form-item prop="user" class="item">
                <dir>身份</dir>
                <el-radio-group v-model="registeredForm.user">
                    <el-radio label="student" value="student"></el-radio>
                    <el-radio label="leader" value="leader"> </el-radio>
                    <el-radio label=administrator value="administrator"></el-radio>
                </el-radio-group>
            </el-form-item>
            <el-form-item class="item" prop="name">
                姓名<el-input
                    v-model="registeredForm.name"
                    placeholder="请输入姓名"
            ></el-input>
            </el-form-item>
            <el-form-item class="item" prop="sno">
                学号<el-input
                    v-model="registeredForm.sno"
                    placeholder="请输入学号"
            ></el-input>
            </el-form-item>
            <el-form-item class="item" prop="pwd">
                密码
                <el-input
                        type="password"
                        v-model="registeredForm.password"
                        placeholder="请输入密码"
                ></el-input>
            </el-form-item>
            <el-form-item class="item">
                重复密码<el-input placeholder="请重复密码"></el-input>
            </el-form-item>
            <el-form-item class="item" prop="college">
                <span>学院</span><br>
                <el-select v-model="value" placeholder="请选择学院">
                    <el-option
                            v-for="item in options"
                            :key="item.value"
                            :label="item.label"
                            :value="item.value"
                    >
                    </el-option>
                </el-select>
            </el-form-item>
            <el-form-item class="item">
                <el-row :gutter="20">
                    <el-col :span="12" :offset="0">
                        <router-link to = "./views/">
                            <el-button class="btn" type="primary" @click="onSubmit"
                            >注册</el-button
                            >
                        </router-link>
                    </el-col>
                    <el-col :span="12" :offset="0">
                        <router-link to = "./views/">
                            <el-button class="btn">登录</el-button>
                        </router-link>
                    </el-col>
                </el-row>
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import { ref, defineComponent } from 'vue'
    import request from "../utils/resourse";

    export default {
        name: "registered",
        components: {},
        data() {
            return {
                registeredForm: [{
                    // user: "",
                    name: "",
                    sno:"",
                    pwd: "",
                    college: "",
                }],
            };
        },
        methods:{
            save(){
                if(this.user == "student") request.post("/stu",this.registeredForm)
                else if(this.user == "leader") request.post("/leader",this.registeredForm)
                else if(this.user == "administrator") request.post("/admin",this.registeredForm)
            },
        },
        setup() {
            return {
                options: ref([
                    {
                        value: '计算机',
                        label: '计算机',
                    },
                    {
                        value: '通信',
                        label: '通信',
                    },
                    {
                        value: '传媒',
                        label: '传媒',
                    },
                    {
                        value: '国际',
                        label: '国际',
                    },
                    {
                        value: '软件',
                        label: '软件',
                    },
                ]),
                value: ref(''),
            }

        },
    };
</script>

<style  scoped>
    .registeredcontainer {
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .registeredForm {
        height: 650px;
        width: 400px;
        box-shadow: 0 0 25px #cac6c6;
        border-radius: 10px;
        padding: 20px 30px;
    }
    .registeredTitle {
        font-size: 24px;
        font-weight: 600;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .btn {
        width: 100%;
    }
    .item {
        height: 60px;
    }
</style>