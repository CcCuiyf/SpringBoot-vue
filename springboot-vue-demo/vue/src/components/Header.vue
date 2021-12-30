<template>
  <div
    style="
      height: 40px;
      line-height: 40px;
      border-bottom: 1px solid #ccc;
      display: flex;
    "
  >
    <div style="width: 200px; padding-left: 50px; font-weight: bold ;color:#409fff">
      课程管理系统
    </div>
    <div style="flex: 1"></div>
    <div style="width: 100px; padding-right: 30px;font-weight: bold">
      <el-dropdown>
        <span class="el-dropdown-link">
          用户名
          <el-icon class="el-icon--right">
            <arrow-down />
          </el-icon>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>个人信息</el-dropdown-item>
            <el-dropdown-item>退出登录</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: "Header"
};
</script>

<style scoped>
</style>