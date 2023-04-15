<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="spjinname">
        <el-input
          v-model="queryParams.spjinname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinmark">
        <el-input
          v-model="queryParams.spjinmark"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinmark1">
        <el-input
          v-model="queryParams.spjinmark1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinmark2">
        <el-input
          v-model="queryParams.spjinmark2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinmark3">
        <el-input
          v-model="queryParams.spjinmark3"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjindate">
        <el-date-picker clearable
          v-model="queryParams.spjindate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="spjindate1">
        <el-date-picker clearable
          v-model="queryParams.spjindate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinzong">
        <el-input
          v-model="queryParams.spjinzong"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinjine">
        <el-input
          v-model="queryParams.spjinjine"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinze">
        <el-input
          v-model="queryParams.spjinze"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjintype1">
        <el-input
          v-model="queryParams.spjintype1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="shangpinid">
        <el-input
          v-model="queryParams.shangpinid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="shangpinname">
        <el-input
          v-model="queryParams.shangpinname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="sptypeid">
        <el-input
          v-model="queryParams.sptypeid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="sptypename">
        <el-input
          v-model="queryParams.sptypename"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spcangkuid">
        <el-input
          v-model="queryParams.spcangkuid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spcangkuname">
        <el-input
          v-model="queryParams.spcangkuname"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysid">
        <el-input
          v-model="queryParams.spgysid"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spgysname">
        <el-input
          v-model="queryParams.spgysname"
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
      <el-form-item label="${comment}" prop="spjinimg">
        <el-input
          v-model="queryParams.spjinimg"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spjinimgname">
        <el-input
          v-model="queryParams.spjinimgname"
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
          v-hasPermi="['car:spjin:add']"
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
          v-hasPermi="['car:spjin:edit']"
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
          v-hasPermi="['car:spjin:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:spjin:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="spjinList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="spjinid" />
      <el-table-column label="${comment}" align="center" prop="spjinname" />
      <el-table-column label="${comment}" align="center" prop="spjinmark" />
      <el-table-column label="${comment}" align="center" prop="spjinmark1" />
      <el-table-column label="${comment}" align="center" prop="spjinmark2" />
      <el-table-column label="${comment}" align="center" prop="spjinmark3" />
      <el-table-column label="${comment}" align="center" prop="spjindate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spjindate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="spjindate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.spjindate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="spjinzong" />
      <el-table-column label="${comment}" align="center" prop="spjinjine" />
      <el-table-column label="${comment}" align="center" prop="spjinze" />
      <el-table-column label="${comment}" align="center" prop="spjintype" />
      <el-table-column label="${comment}" align="center" prop="spjintype1" />
      <el-table-column label="${comment}" align="center" prop="shangpinid" />
      <el-table-column label="${comment}" align="center" prop="shangpinname" />
      <el-table-column label="${comment}" align="center" prop="sptypeid" />
      <el-table-column label="${comment}" align="center" prop="sptypename" />
      <el-table-column label="${comment}" align="center" prop="spcangkuid" />
      <el-table-column label="${comment}" align="center" prop="spcangkuname" />
      <el-table-column label="${comment}" align="center" prop="spgysid" />
      <el-table-column label="${comment}" align="center" prop="spgysname" />
      <el-table-column label="${comment}" align="center" prop="userid" />
      <el-table-column label="${comment}" align="center" prop="username" />
      <el-table-column label="${comment}" align="center" prop="bumenid" />
      <el-table-column label="${comment}" align="center" prop="bumenname" />
      <el-table-column label="${comment}" align="center" prop="roleid" />
      <el-table-column label="${comment}" align="center" prop="rolename" />
      <el-table-column label="${comment}" align="center" prop="spjinimg" />
      <el-table-column label="${comment}" align="center" prop="spjinimgname" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:spjin:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:spjin:remove']"
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

    <!-- 添加或修改地址信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="${comment}" prop="spjinname">
          <el-input v-model="form.spjinname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinmark">
          <el-input v-model="form.spjinmark" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinmark1">
          <el-input v-model="form.spjinmark1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinmark2">
          <el-input v-model="form.spjinmark2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinmark3">
          <el-input v-model="form.spjinmark3" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjindate">
          <el-date-picker clearable
            v-model="form.spjindate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="spjindate1">
          <el-date-picker clearable
            v-model="form.spjindate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinzong">
          <el-input v-model="form.spjinzong" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinjine">
          <el-input v-model="form.spjinjine" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinze">
          <el-input v-model="form.spjinze" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjintype1">
          <el-input v-model="form.spjintype1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="shangpinid">
          <el-input v-model="form.shangpinid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="shangpinname">
          <el-input v-model="form.shangpinname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="sptypeid">
          <el-input v-model="form.sptypeid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="sptypename">
          <el-input v-model="form.sptypename" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spcangkuid">
          <el-input v-model="form.spcangkuid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spcangkuname">
          <el-input v-model="form.spcangkuname" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysid">
          <el-input v-model="form.spgysid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spgysname">
          <el-input v-model="form.spgysname" placeholder="请输入${comment}" />
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
        <el-form-item label="${comment}" prop="roleid">
          <el-input v-model="form.roleid" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="rolename">
          <el-input v-model="form.rolename" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinimg">
          <el-input v-model="form.spjinimg" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spjinimgname">
          <el-input v-model="form.spjinimgname" placeholder="请输入${comment}" />
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
import { listSpjin, getSpjin, delSpjin, addSpjin, updateSpjin } from "@/api/car/spjin";

export default {
  name: "Spjin",
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
      // 地址信息表格数据
      spjinList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        spjinname: null,
        spjinmark: null,
        spjinmark1: null,
        spjinmark2: null,
        spjinmark3: null,
        spjindate: null,
        spjindate1: null,
        spjinzong: null,
        spjinjine: null,
        spjinze: null,
        spjintype: null,
        spjintype1: null,
        shangpinid: null,
        shangpinname: null,
        sptypeid: null,
        sptypename: null,
        spcangkuid: null,
        spcangkuname: null,
        spgysid: null,
        spgysname: null,
        userid: null,
        username: null,
        bumenid: null,
        bumenname: null,
        roleid: null,
        rolename: null,
        spjinimg: null,
        spjinimgname: null
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
    /** 查询地址信息列表 */
    getList() {
      this.loading = true;
      listSpjin(this.queryParams).then(response => {
        this.spjinList = response.rows;
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
        spjinid: null,
        spjinname: null,
        spjinmark: null,
        spjinmark1: null,
        spjinmark2: null,
        spjinmark3: null,
        spjindate: null,
        spjindate1: null,
        spjinzong: null,
        spjinjine: null,
        spjinze: null,
        spjintype: null,
        spjintype1: null,
        shangpinid: null,
        shangpinname: null,
        sptypeid: null,
        sptypename: null,
        spcangkuid: null,
        spcangkuname: null,
        spgysid: null,
        spgysname: null,
        userid: null,
        username: null,
        bumenid: null,
        bumenname: null,
        roleid: null,
        rolename: null,
        spjinimg: null,
        spjinimgname: null
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
      this.ids = selection.map(item => item.spjinid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加地址信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const spjinid = row.spjinid || this.ids
      getSpjin(spjinid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改地址信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.spjinid != null) {
            updateSpjin(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSpjin(this.form).then(response => {
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
      const spjinids = row.spjinid || this.ids;
      this.$modal.confirm('是否确认删除地址信息编号为"' + spjinids + '"的数据项？').then(function() {
        return delSpjin(spjinids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/spjin/export', {
        ...this.queryParams
      }, `spjin_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
