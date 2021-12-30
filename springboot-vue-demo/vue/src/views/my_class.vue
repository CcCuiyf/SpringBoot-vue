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
                <el-popconfirm title="Are you sure to delete this?">
                    <template #reference>
                        <el-button type="text" size="small" @onclick="del">删除</el-button>
                    </template>
                </el-popconfirm>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
    // @ is an alias to /src
    import Aside_menu from "@/components/Aside_menu";
    import request from "../utils/resourse";

    let sno = sessionStorage.getItem('user');

    export default {
        name: "my_class",
        components: {
            Aside_menu,
        },
        created() {
            this.load()
        },
        data() {
            return {
                tableData: [

                ],
            };
        },
        methods:{
            load(){
                request.get("/stu/xuanke",sno).then(res =>{
                    this.tableData = res.data
                })
            }
        }
    };
</script>
