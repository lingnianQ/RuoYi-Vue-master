<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="spgysname">
        <el-input
          v-model="queryParams.spgysname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysmark">
        <el-input
          v-model="queryParams.spgysmark"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysmark1">
        <el-input
          v-model="queryParams.spgysmark1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysmark2">
        <el-input
          v-model="queryParams.spgysmark2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysphone">
        <el-input
          v-model="queryParams.spgysphone"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysdizhi">
        <el-input
          v-model="queryParams.spgysdizhi"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysdate">
        <el-date-picker clearable
          v-model="queryParams.spgysdate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysdate1">
        <el-date-picker clearable
          v-model="queryParams.spgysdate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="spgystype1">
        <el-input
          v-model="queryParams.spgystype1"
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
          v-hasPermi="['car:spgys:add']"
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
          v-hasPermi="['car:spgys:edit']"
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
          v-hasPermi="['car:spgys:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:spgys:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="spgysList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="spgysid" />
      <el-table-column label="${comment}" align="center" prop="spgysname" />
      <el-table-column label="${comment}" align="center" prop="spgysmark" />
      <el-table-column label="${comment}" align="center" prop="spgysmark1" />
      <el-table-column label="${comment}" align="center" prop="spgysmark2" />
      <el-table-column label="${comment}" align="center" prop="spgysphone" />
      <el-table-column label="${comment}" align="center" prop="spgysdizhi" />
      <el-table-column label="${comment}" align="center" prop="spgysdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spgysdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="spgysdate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spgysdate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="spgystype" />
      <el-table-column label="${comment}" align="center" prop="spgystype1" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:spgys:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:spgys:remove']"
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

    <!-- 添加或修改员工信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="spgysname">
          <el-input v-model="form.spgysname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysmark">
          <el-input v-model="form.spgysmark" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysmark1">
          <el-input v-model="form.spgysmark1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysmark2">
          <el-input v-model="form.spgysmark2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysphone">
          <el-input v-model="form.spgysphone" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysdizhi">
          <el-input v-model="form.spgysdizhi" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysdate">
          <el-date-picker clearable
            v-model="form.spgysdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysdate1">
          <el-date-picker clearable
            v-model="form.spgysdate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="spgystype1">
          <el-input v-model="form.spgystype1" placeholder="请输入${comment}" />
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
import { listSpgys, getSpgys, delSpgys, addSpgys, updateSpgys } from "@/api/car/spgys";

export default {
  name: "Spgys",
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
      // 员工信息表格数据
      spgysList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        spgysname: null,
        spgysmark: null,
        spgysmark1: null,
        spgysmark2: null,
        spgysphone: null,
        spgysdizhi: null,
        spgysdate: null,
        spgysdate1: null,
        spgystype: null,
        spgystype1: null
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
    /** 查询员工信息列表 */
    getList() {
      this.loading = true;
      listSpgys(this.queryParams).then(response => {
        this.spgysList = response.rows;
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
        spgysid: null,
        spgysname: null,
        spgysmark: null,
        spgysmark1: null,
        spgysmark2: null,
        spgysphone: null,
        spgysdizhi: null,
        spgysdate: null,
        spgysdate1: null,
        spgystype: null,
        spgystype1: null
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
      this.ids = selection.map(item => item.spgysid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加员工信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const spgysid = row.spgysid || this.ids
      getSpgys(spgysid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改员工信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.spgysid != null) {
            updateSpgys(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSpgys(this.form).then(response => {
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
      const spgysids = row.spgysid || this.ids;
      this.$modal.confirm('是否确认删除员工信息编号为"' + spgysids + '"的数据项？').then(function() {
        return delSpgys(spgysids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/spgys/export', {
        ...this.queryParams
      }, `spgys_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
