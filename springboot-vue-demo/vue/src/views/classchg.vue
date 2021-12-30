<template>
    <div>
        <el-table
                :data="tableData"
                height="calc(100vh - 150px)"
                style="width: 100%"
        >
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
                    >编辑</el-button
                    >
                    <el-popconfirm title="Are you sure to delete this?">
                        <template #reference>
                            <el-button type="text" size="small">删除</el-button>
                        </template>
                    </el-popconfirm>
                </template>
            </el-table-column>
        </el-table>
        <div style="margin: 10px 0">
            <input
                    v-model="search"
                    placeholder="请输入课程id"
                    style="width: 20%; height: 40px"
            />
            <el-button type="primary" style="margin-left: 10px" @click="handleserch">查询</el-button>


        </div>



        <div class="addtainer" style="margin-top: 20px" >
            <el-form
                    :model="addForm"
                    class="addForm"
                    ref="addForm"
                    :inline="false"
                    size="normal"
            >

                <el-form-item>
                    课程id<el-input
                        v-model="addForm.id"
                        placeholder="请输入课程id">
                </el-input>
                </el-form-item>
                <el-form-item>
                    科目<el-input
                        v-model="addForm.subject"
                        placeholder="请输入科目">
                </el-input>
                </el-form-item>
                <el-form-item>
                    leader姓名<el-input
                        v-model="addForm.leader_name"
                        placeholder="请输入leader名称">
                </el-input>
                </el-form-item>
                <el-form-item>
                    <el-row :gutter="20">
                        <el-col :span="12" :offset="0">
                            <el-button class="btn" type="primary" @click="onSubmit">增加</el-button>
                        </el-col>
                        <el-col :span="12" :offset="0">
                        </el-col>
                    </el-row>
                </el-form-item>
            </el-form>


        </div>
    </div>
</template>



<script>
    // @ is an alias to /src
    export default {
        name: "classchg",
        components: {},
        data() {
            return {
                addForm: {
                    identity: "",
                    username: "",
                    password: "",
                },
                serch: "",
                tableData: [
                    {
                        id: "2016-05-02",
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
        methods: {
            handleEdit() {},
        },
    };
</script>

<style>
    .addcontainer {
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .addForm {
        height: 420px;
        width: 400px;
        border: 2px solid black;
        border-radius: 10px;
        padding: 20px 30px;
    }
    .addTitle {
        font-size: 24px;
        font-weight: 600;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .btn {
        width: 100%;
    }
</style>
