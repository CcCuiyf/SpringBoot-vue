<template>
  <div>
    <el-table :data="tableData" height="calc(100vh - 50px)" style="width: 100%">
      <el-table-column prop="id" label="课程号" style="text-align: center" />
      <el-table-column prop="subject" label="科目" style="text-align: center" />
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


export default {
  name: "Home",
  components: {
    
  },
  data() {
    return {
      tableData: [
        {
          id: "2016-05-03",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-02",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-04",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-01",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-08",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-06",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
        {
          id: "2016-05-07",
          subject: "Tom",
          leader_name: "No. 189, Grove St, Los Angeles",
        },
      ],
    };
  },
};
</script>
