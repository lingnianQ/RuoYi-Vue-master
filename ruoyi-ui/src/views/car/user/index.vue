<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="username">
        <el-input
          v-model="queryParams.username"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userpassword">
        <el-input
          v-model="queryParams.userpassword"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userxingming">
        <el-input
          v-model="queryParams.userxingming"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userage">
        <el-input
          v-model="queryParams.userage"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userphone">
        <el-input
          v-model="queryParams.userphone"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="usermark1">
        <el-input
          v-model="queryParams.usermark1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="usermark2">
        <el-input
          v-model="queryParams.usermark2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="usermark3">
        <el-input
          v-model="queryParams.usermark3"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="usermark4">
        <el-input
          v-model="queryParams.usermark4"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userdate1">
        <el-date-picker clearable
          v-model="queryParams.userdate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="userdate2">
        <el-date-picker clearable
          v-model="queryParams.userdate2"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="usertype1">
        <el-input
          v-model="queryParams.usertype1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="usertype2">
        <el-input
          v-model="queryParams.usertype2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userimg">
        <el-input
          v-model="queryParams.userimg"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userimgname">
        <el-input
          v-model="queryParams.userimgname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="roleid">
        <el-input
          v-model="queryParams.roleid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="rolename">
        <el-input
          v-model="queryParams.rolename"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="bumenid">
        <el-input
          v-model="queryParams.bumenid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="bumenname">
        <el-input
          v-model="queryParams.bumenname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['car:user:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['car:user:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['car:user:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:user:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="userList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="userid" />
      <el-table-column label="${comment}" align="center" prop="username" />
      <el-table-column label="${comment}" align="center" prop="userpassword" />
      <el-table-column label="${comment}" align="center" prop="userxingming" />
      <el-table-column label="${comment}" align="center" prop="usersex" />
      <el-table-column label="${comment}" align="center" prop="userage" />
      <el-table-column label="${comment}" align="center" prop="userphone" />
      <el-table-column label="${comment}" align="center" prop="usermark1" />
      <el-table-column label="${comment}" align="center" prop="usermark2" />
      <el-table-column label="${comment}" align="center" prop="usermark3" />
      <el-table-column label="${comment}" align="center" prop="usermark4" />
      <el-table-column label="${comment}" align="center" prop="userdate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.userdate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="userdate2" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.userdate2, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="usertype1" />
      <el-table-column label="${comment}" align="center" prop="usertype2" />
      <el-table-column label="${comment}" align="center" prop="userimg" />
      <el-table-column label="${comment}" align="center" prop="userimgname" />
      <el-table-column label="${comment}" align="center" prop="roleid" />
      <el-table-column label="${comment}" align="center" prop="rolename" />
      <el-table-column label="${comment}" align="center" prop="bumenid" />
      <el-table-column label="${comment}" align="center" prop="bumenname" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:user:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:user:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改用户信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="username">
          <el-input v-model="form.username" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userpassword">
          <el-input v-model="form.userpassword" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userxingming">
          <el-input v-model="form.userxingming" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userage">
          <el-input v-model="form.userage" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userphone">
          <el-input v-model="form.userphone" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="usermark1">
          <el-input v-model="form.usermark1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="usermark2">
          <el-input v-model="form.usermark2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="usermark3">
          <el-input v-model="form.usermark3" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="usermark4">
          <el-input v-model="form.usermark4" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userdate1">
          <el-date-picker clearable
            v-model="form.userdate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="userdate2">
          <el-date-picker clearable
            v-model="form.userdate2"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="usertype1">
          <el-input v-model="form.usertype1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="usertype2">
          <el-input v-model="form.usertype2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userimg">
          <el-input v-model="form.userimg" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userimgname">
          <el-input v-model="form.userimgname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="roleid">
          <el-input v-model="form.roleid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="rolename">
          <el-input v-model="form.rolename" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="bumenid">
          <el-input v-model="form.bumenid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="bumenname">
          <el-input v-model="form.bumenname" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listUser, getUser, delUser, addUser, updateUser } from "@/api/car/user";

export default {
  name: "User",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 用户信息表格数据
      userList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        username: null,
        userpassword: null,
        userxingming: null,
        usersex: null,
        userage: null,
        userphone: null,
        usermark1: null,
        usermark2: null,
        usermark3: null,
        usermark4: null,
        userdate1: null,
        userdate2: null,
        usertype1: null,
        usertype2: null,
        userimg: null,
        userimgname: null,
        roleid: null,
        rolename: null,
        bumenid: null,
        bumenname: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询用户信息列表 */
    getList() {
      this.loading = true;
      listUser(this.queryParams).then(response => {
        this.userList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        userid: null,
        username: null,
        userpassword: null,
        userxingming: null,
        usersex: null,
        userage: null,
        userphone: null,
        usermark1: null,
        usermark2: null,
        usermark3: null,
        usermark4: null,
        userdate1: null,
        userdate2: null,
        usertype1: null,
        usertype2: null,
        userimg: null,
        userimgname: null,
        roleid: null,
        rolename: null,
        bumenid: null,
        bumenname: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.userid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加用户信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const userid = row.userid || this.ids
      getUser(userid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改用户信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.userid != null) {
            updateUser(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addUser(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const userids = row.userid || this.ids;
      this.$modal.confirm('是否确认删除用户信息编号为"' + userids + '"的数据项？').then(function() {
        return delUser(userids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/user/export', {
        ...this.queryParams
      }, `user_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
