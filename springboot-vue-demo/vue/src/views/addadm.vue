<template>
    <div class="addadmcontainer" style="margin-top:10vh">
        <el-form
                :model="addadmForm"
                class="addadmForm"
                ref="addadmForm"
                :inline="false"
                size="normal"
        >
            <el-form-item>
                <dir class="addadmTitle">注册管理员</dir>
            </el-form-item>
            <el-form-item class="item">
                姓名
                <el-input
                        v-model="addadmForm.username"
                        placeholder="请输入姓名"
                />
            </el-form-item>
            <el-form-item class="item">
                学号
                <el-input
                        v-model="addadmForm.sno"
                        placeholder="请输入学号"
                />
            </el-form-item>
            <el-form-item class="item">
                密码
                <el-input
                        type="password"
                        v-model="addadmForm.password"
                        placeholder="请输入密码"
                />
            </el-form-item>
            <el-form-item class="item">
                重复密码
                <el-input
                        type="rpwd"
                        placeholder="请重复密码"/>
            </el-form-item>
            <el-form-item class="item">
                <el-button class="btn" type="primary" @click="onsubmit"
                >注册</el-button
                >
            </el-form-item>
        </el-form>
    </div>
</template>

<script>
    import { ref, defineComponent } from 'vue'
    import request from "../utils/resourse";
    export default {
        name: "addadm",
        components: {},

        methods:{
            onsubmit(){
                //console.log(this.addadmForm)
                request.post("/administrator/save",this.addadmForm)
            },
            save(){

            }

        },
        data() {
            return {
                addadmForm: {
                    username:"" ,
                    sno:"",
                    password:""
                },
            };
        },
        setup() {
            return {


            }
        },
    };
</script>

<style  scoped>
    .addadmcontainer {
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .addadmForm {
        height: 480px;
        width: 400px;
        box-shadow: 0 0 25px #cac6c6;
        border-radius: 10px;
        padding: 20px 30px;
    }
    .addadmTitle {
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