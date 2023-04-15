<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="车牌" prop="spcangkuname">
        <el-input
          v-model="queryParams.spcangkuname"
          placeholder="请输入车牌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标志1" prop="spcangkumark">
        <el-input
          v-model="queryParams.spcangkumark"
          placeholder="请输入标志1"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标志2" prop="spcangkumark1">
        <el-input
          v-model="queryParams.spcangkumark1"
          placeholder="请输入标志2"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标志3" prop="spcangkumark2">
        <el-input
          v-model="queryParams.spcangkumark2"
          placeholder="请输入标志3"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标志4" prop="spcangkuphone">
        <el-input
          v-model="queryParams.spcangkuphone"
          placeholder="请输入标志4"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地址" prop="spcangkudizhi">
        <el-input
          v-model="queryParams.spcangkudizhi"
          placeholder="请输入地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="日期" prop="spcangkudate">
        <el-date-picker clearable
          v-model="queryParams.spcangkudate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="日期1" prop="spcangkudate1">
        <el-date-picker clearable
          v-model="queryParams.spcangkudate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择日期1">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="类型1" prop="spcangkutype1">
        <el-input
          v-model="queryParams.spcangkutype1"
          placeholder="请输入类型1"
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
          v-hasPermi="['car:spcangku:add']"
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
          v-hasPermi="['car:spcangku:edit']"
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
          v-hasPermi="['car:spcangku:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:spcangku:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="spcangkuList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="编号" align="center" prop="spcangkuid" />
      <el-table-column label="车牌" align="center" prop="spcangkuname" />
      <el-table-column label="标志1" align="center" prop="spcangkumark" />
      <el-table-column label="标志2" align="center" prop="spcangkumark1" />
      <el-table-column label="标志3" align="center" prop="spcangkumark2" />
      <el-table-column label="标志4" align="center" prop="spcangkuphone" />
      <el-table-column label="地址" align="center" prop="spcangkudizhi" />
      <el-table-column label="日期" align="center" prop="spcangkudate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spcangkudate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="日期1" align="center" prop="spcangkudate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spcangkudate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="类型" align="center" prop="spcangkutype" />
      <el-table-column label="类型1" align="center" prop="spcangkutype1" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:spcangku:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:spcangku:remove']"
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

    <!-- 添加或修改车辆信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="车牌" prop="spcangkuname">
          <el-input v-model="form.spcangkuname" placeholder="请输入车牌" />
        </el-form-item>
        <el-form-item label="标志1" prop="spcangkumark">
          <el-input v-model="form.spcangkumark" placeholder="请输入标志1" />
        </el-form-item>
        <el-form-item label="标志2" prop="spcangkumark1">
          <el-input v-model="form.spcangkumark1" placeholder="请输入标志2" />
        </el-form-item>
        <el-form-item label="标志3" prop="spcangkumark2">
          <el-input v-model="form.spcangkumark2" placeholder="请输入标志3" />
        </el-form-item>
        <el-form-item label="标志4" prop="spcangkuphone">
          <el-input v-model="form.spcangkuphone" placeholder="请输入标志4" />
        </el-form-item>
        <el-form-item label="地址" prop="spcangkudizhi">
          <el-input v-model="form.spcangkudizhi" placeholder="请输入地址" />
        </el-form-item>
        <el-form-item label="日期" prop="spcangkudate">
          <el-date-picker clearable
            v-model="form.spcangkudate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="日期1" prop="spcangkudate1">
          <el-date-picker clearable
            v-model="form.spcangkudate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择日期1">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="类型1" prop="spcangkutype1">
          <el-input v-model="form.spcangkutype1" placeholder="请输入类型1" />
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
import { listSpcangku, getSpcangku, delSpcangku, addSpcangku, updateSpcangku } from "@/api/car/spcangku";

export default {
  name: "Spcangku",
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
      // 车辆信息表格数据
      spcangkuList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        spcangkuname: null,
        spcangkumark: null,
        spcangkumark1: null,
        spcangkumark2: null,
        spcangkuphone: null,
        spcangkudizhi: null,
        spcangkudate: null,
        spcangkudate1: null,
        spcangkutype: null,
        spcangkutype1: null
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
    /** 查询车辆信息列表 */
    getList() {
      this.loading = true;
      listSpcangku(this.queryParams).then(response => {
        this.spcangkuList = response.rows;
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
        spcangkuid: null,
        spcangkuname: null,
        spcangkumark: null,
        spcangkumark1: null,
        spcangkumark2: null,
        spcangkuphone: null,
        spcangkudizhi: null,
        spcangkudate: null,
        spcangkudate1: null,
        spcangkutype: null,
        spcangkutype1: null
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
      this.ids = selection.map(item => item.spcangkuid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加车辆信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const spcangkuid = row.spcangkuid || this.ids
      getSpcangku(spcangkuid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改车辆信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.spcangkuid != null) {
            updateSpcangku(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSpcangku(this.form).then(response => {
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
      const spcangkuids = row.spcangkuid || this.ids;
      this.$modal.confirm('是否确认删除车辆信息编号为"' + spcangkuids + '"的数据项？').then(function() {
        return delSpcangku(spcangkuids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/spcangku/export', {
        ...this.queryParams
      }, `spcangku_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
