<template>
    <div>
        <el-menu
                default-active=""
                class="el-menu-vertical-demo"
                style="width:150px;min-height:calc(100vh - 50px)">
            <router-link to="./view/home" class="menu">
                <el-menu-item index="1">
                    <el-icon><icon-menu /></el-icon>
                    <span>课程清单</span>
                </el-menu-item>
            </router-link>
            <router-link to="./view/my_class" class="menu">
                <el-menu-item index="2" style="margin-top:40px">
                    <el-icon><icon-menu /></el-icon>
                    <span>我的课表</span>
                </el-menu-item>
            </router-link>
            <el-sub-menu index="3" style="margin-top:40px">
                <template #title>
                    <el-icon><location /></el-icon>
                    <span>管理界面</span>
                </template>
                <router-link to="./view/classchg" class="menu">
                    <el-menu-item index="3-1" style="width: 150px;">课程更改</el-menu-item>
                </router-link>
                <router-link to="./view/addadm" class="menu">
                    <el-menu-item index="3-2" style="width: 150px;"> 新增管理</el-menu-item>
                </router-link>
            </el-sub-menu>
        </el-menu>
    </div>
</template>


<script>
    export default {
        name: "Aside-menu",
    };
</script>

<style scoped>
</style>