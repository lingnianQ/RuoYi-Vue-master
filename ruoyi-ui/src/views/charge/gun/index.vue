<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="gunNumber">
        <el-input
          v-model="queryParams.gunNumber"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="gunName">
        <el-input
          v-model="queryParams.gunName"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="power">
        <el-input
          v-model="queryParams.power"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="electricity">
        <el-input
          v-model="queryParams.electricity"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="voltageUpperLimits">
        <el-input
          v-model="queryParams.voltageUpperLimits"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="voltageLowerLimits">
        <el-input
          v-model="queryParams.voltageLowerLimits"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="pileId">
        <el-input
          v-model="queryParams.pileId"
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
          v-hasPermi="['charge:gun:add']"
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
          v-hasPermi="['charge:gun:edit']"
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
          v-hasPermi="['charge:gun:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['charge:gun:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="gunList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="${comment}" align="center" prop="gunNumber" />
      <el-table-column label="${comment}" align="center" prop="gunName" />
      <el-table-column label="${comment}" align="center" prop="power" />
      <el-table-column label="${comment}" align="center" prop="electricity" />
      <el-table-column label="${comment}" align="center" prop="voltageUpperLimits" />
      <el-table-column label="${comment}" align="center" prop="voltageLowerLimits" />
      <el-table-column label="${comment}" align="center" prop="gunType" />
      <el-table-column label="${comment}" align="center" prop="pileId" />
      <el-table-column label="${comment}" align="center" prop="gunStatus" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['charge:gun:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['charge:gun:remove']"
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

    <!-- 添加或修改充电枪对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="gunNumber">
          <el-input v-model="form.gunNumber" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="gunName">
          <el-input v-model="form.gunName" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="power">
          <el-input v-model="form.power" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="electricity">
          <el-input v-model="form.electricity" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="voltageUpperLimits">
          <el-input v-model="form.voltageUpperLimits" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="voltageLowerLimits">
          <el-input v-model="form.voltageLowerLimits" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="pileId">
          <el-input v-model="form.pileId" placeholder="请输入${comment}" />
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
import { listGun, getGun, delGun, addGun, updateGun } from "@/api/charge/gun";

export default {
  name: "Gun",
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
      // 充电枪表格数据
      gunList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        gunNumber: null,
        gunName: null,
        power: null,
        electricity: null,
        voltageUpperLimits: null,
        voltageLowerLimits: null,
        gunType: null,
        pileId: null,
        gunStatus: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        gunNumber: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询充电枪列表 */
    getList() {
      this.loading = true;
      listGun(this.queryParams).then(response => {
        this.gunList = response.rows;
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
        id: null,
        gunNumber: null,
        gunName: null,
        power: null,
        electricity: null,
        voltageUpperLimits: null,
        voltageLowerLimits: null,
        gunType: null,
        pileId: null,
        gunStatus: 0,
        createTime: null
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
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加充电枪";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getGun(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改充电枪";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateGun(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGun(this.form).then(response => {
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
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除充电枪编号为"' + ids + '"的数据项？').then(function() {
        return delGun(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('charge/gun/export', {
        ...this.queryParams
      }, `gun_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
