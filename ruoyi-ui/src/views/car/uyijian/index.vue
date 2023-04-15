<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="uyijianname">
        <el-input
          v-model="queryParams.uyijianname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijianmark">
        <el-input
          v-model="queryParams.uyijianmark"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijianmark1">
        <el-input
          v-model="queryParams.uyijianmark1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijianmark2">
        <el-input
          v-model="queryParams.uyijianmark2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijianimg">
        <el-input
          v-model="queryParams.uyijianimg"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijianimgname">
        <el-input
          v-model="queryParams.uyijianimgname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijiandate">
        <el-date-picker clearable
          v-model="queryParams.uyijiandate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijiandate1">
        <el-date-picker clearable
          v-model="queryParams.uyijiandate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="uyijiantype1">
        <el-input
          v-model="queryParams.uyijiantype1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userid">
        <el-input
          v-model="queryParams.userid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="username">
        <el-input
          v-model="queryParams.username"
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
          v-hasPermi="['car:uyijian:add']"
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
          v-hasPermi="['car:uyijian:edit']"
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
          v-hasPermi="['car:uyijian:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:uyijian:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="uyijianList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="uyijianid" />
      <el-table-column label="${comment}" align="center" prop="uyijianname" />
      <el-table-column label="${comment}" align="center" prop="uyijianmark" />
      <el-table-column label="${comment}" align="center" prop="uyijianmark1" />
      <el-table-column label="${comment}" align="center" prop="uyijianmark2" />
      <el-table-column label="${comment}" align="center" prop="uyijianimg" />
      <el-table-column label="${comment}" align="center" prop="uyijianimgname" />
      <el-table-column label="${comment}" align="center" prop="uyijiandate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.uyijiandate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="uyijiandate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.uyijiandate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="uyijiantype" />
      <el-table-column label="${comment}" align="center" prop="uyijiantype1" />
      <el-table-column label="${comment}" align="center" prop="userid" />
      <el-table-column label="${comment}" align="center" prop="username" />
      <el-table-column label="${comment}" align="center" prop="bumenid" />
      <el-table-column label="${comment}" align="center" prop="bumenname" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:uyijian:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:uyijian:remove']"
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

    <!-- 添加或修改评价对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="uyijianname">
          <el-input v-model="form.uyijianname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijianmark">
          <el-input v-model="form.uyijianmark" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijianmark1">
          <el-input v-model="form.uyijianmark1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijianmark2">
          <el-input v-model="form.uyijianmark2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijianimg">
          <el-input v-model="form.uyijianimg" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijianimgname">
          <el-input v-model="form.uyijianimgname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijiandate">
          <el-date-picker clearable
            v-model="form.uyijiandate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijiandate1">
          <el-date-picker clearable
            v-model="form.uyijiandate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="uyijiantype1">
          <el-input v-model="form.uyijiantype1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userid">
          <el-input v-model="form.userid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="username">
          <el-input v-model="form.username" placeholder="请输入${comment}" />
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
import { listUyijian, getUyijian, delUyijian, addUyijian, updateUyijian } from "@/api/car/uyijian";

export default {
  name: "Uyijian",
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
      // 评价表格数据
      uyijianList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        uyijianname: null,
        uyijianmark: null,
        uyijianmark1: null,
        uyijianmark2: null,
        uyijianimg: null,
        uyijianimgname: null,
        uyijiandate: null,
        uyijiandate1: null,
        uyijiantype: null,
        uyijiantype1: null,
        userid: null,
        username: null,
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
    /** 查询评价列表 */
    getList() {
      this.loading = true;
      listUyijian(this.queryParams).then(response => {
        this.uyijianList = response.rows;
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
        uyijianid: null,
        uyijianname: null,
        uyijianmark: null,
        uyijianmark1: null,
        uyijianmark2: null,
        uyijianimg: null,
        uyijianimgname: null,
        uyijiandate: null,
        uyijiandate1: null,
        uyijiantype: null,
        uyijiantype1: null,
        userid: null,
        username: null,
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
      this.ids = selection.map(item => item.uyijianid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加评价";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const uyijianid = row.uyijianid || this.ids
      getUyijian(uyijianid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改评价";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.uyijianid != null) {
            updateUyijian(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addUyijian(this.form).then(response => {
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
      const uyijianids = row.uyijianid || this.ids;
      this.$modal.confirm('是否确认删除评价编号为"' + uyijianids + '"的数据项？').then(function() {
        return delUyijian(uyijianids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/uyijian/export', {
        ...this.queryParams
      }, `uyijian_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
