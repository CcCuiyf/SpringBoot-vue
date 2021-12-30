<template>
  <div>
    <el-table :data="tableData" height="calc(100vh - 50px)" style="width: 100%">
      <el-table-column prop="id" label="课程号" style="text-align: center" />
      <el-table-column prop="sno" label="科目" style="text-align: center" />
      <el-table-column
        prop="leader_name"
        label="leader"
        style="text-align: center"
      />
      <el-table-column fixed="right" label="操作" width="120">
        <template #default>
          <el-button type="text" size="small" @click="handleEdit"
            >报名</el-button
          >
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
// @ is an alias to /src


import request from "../utils/resourse";

let sno = sessionStorage.getItem('user')
let cnt = sno+'1'


export default {
  name: "Home",
  components: {
  },
  created(){
    this.load()
  },

  data() {
    return {
      cnt,
      tableData: [],
    };
  },
  methods:{
    handleEdit() {
      request.post("/xuanke",this.tableData)
    },
    load(){
      request.get("/course/all").then(res =>{
        this.tableData = res.data
      })
    }
  }
};
</script>
