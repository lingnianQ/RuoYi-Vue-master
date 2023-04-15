<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="商品名称" prop="shangpinname">
        <el-input
          v-model="queryParams.shangpinname"
          placeholder="请输入商品名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品标志0" prop="shangpinmark">
        <el-input
          v-model="queryParams.shangpinmark"
          placeholder="请输入商品标志0"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品标志1" prop="shangpinmark1">
        <el-input
          v-model="queryParams.shangpinmark1"
          placeholder="请输入商品标志1"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品标志2" prop="shangpinmark2">
        <el-input
          v-model="queryParams.shangpinmark2"
          placeholder="请输入商品标志2"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品标志3" prop="shangpinmark3">
        <el-input
          v-model="queryParams.shangpinmark3"
          placeholder="请输入商品标志3"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="日期" prop="shangpindate">
        <el-date-picker clearable
          v-model="queryParams.shangpindate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="日期2" prop="shangpindate1">
        <el-date-picker clearable
          v-model="queryParams.shangpindate1"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择日期2">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="商品库存" prop="shangpinzong">
        <el-input
          v-model="queryParams.shangpinzong"
          placeholder="请输入商品库存"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品价格" prop="shangpinjin">
        <el-input
          v-model="queryParams.shangpinjin"
          placeholder="请输入商品价格"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品销量" prop="shangpinxiao">
        <el-input
          v-model="queryParams.shangpinxiao"
          placeholder="请输入商品销量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品利润" prop="shangpinlirun">
        <el-input
          v-model="queryParams.shangpinlirun"
          placeholder="请输入商品利润"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品类型2" prop="shangpintype1">
        <el-input
          v-model="queryParams.shangpintype1"
          placeholder="请输入商品类型2"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品图片" prop="shangpinimg">
        <el-input
          v-model="queryParams.shangpinimg"
          placeholder="请输入商品图片"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品图片名" prop="shangpinimgname">
        <el-input
          v-model="queryParams.shangpinimgname"
          placeholder="请输入商品图片名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="类型编号" prop="sptypeid">
        <el-input
          v-model="queryParams.sptypeid"
          placeholder="请输入类型编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="类型名" prop="sptypename">
        <el-input
          v-model="queryParams.sptypename"
          placeholder="请输入类型名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户编号" prop="userid">
        <el-input
          v-model="queryParams.userid"
          placeholder="请输入用户编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户名" prop="username">
        <el-input
          v-model="queryParams.username"
          placeholder="请输入用户名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门编号" prop="bumenid">
        <el-input
          v-model="queryParams.bumenid"
          placeholder="请输入部门编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门名称" prop="bumenname">
        <el-input
          v-model="queryParams.bumenname"
          placeholder="请输入部门名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="角色编号" prop="roleid">
        <el-input
          v-model="queryParams.roleid"
          placeholder="请输入角色编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="角色名" prop="rolename">
        <el-input
          v-model="queryParams.rolename"
          placeholder="请输入角色名"
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
          v-hasPermi="['car:shangpin:add']"
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
          v-hasPermi="['car:shangpin:edit']"
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
          v-hasPermi="['car:shangpin:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['car:shangpin:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="shangpinList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="编号" align="center" prop="shangpinid" />
      <el-table-column label="商品名称" align="center" prop="shangpinname" />
      <el-table-column label="商品标志0" align="center" prop="shangpinmark" />
      <el-table-column label="商品标志1" align="center" prop="shangpinmark1" />
      <el-table-column label="商品标志2" align="center" prop="shangpinmark2" />
      <el-table-column label="商品标志3" align="center" prop="shangpinmark3" />
      <el-table-column label="日期" align="center" prop="shangpindate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.shangpindate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="日期2" align="center" prop="shangpindate1" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.shangpindate1, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="商品库存" align="center" prop="shangpinzong" />
      <el-table-column label="商品价格" align="center" prop="shangpinjin" />
      <el-table-column label="商品销量" align="center" prop="shangpinxiao" />
      <el-table-column label="商品利润" align="center" prop="shangpinlirun" />
      <el-table-column label="商品类型" align="center" prop="shangpintype" />
      <el-table-column label="商品类型2" align="center" prop="shangpintype1" />
      <el-table-column label="商品图片" align="center" prop="shangpinimg" />
      <el-table-column label="商品图片名" align="center" prop="shangpinimgname" />
      <el-table-column label="类型编号" align="center" prop="sptypeid" />
      <el-table-column label="类型名" align="center" prop="sptypename" />
      <el-table-column label="用户编号" align="center" prop="userid" />
      <el-table-column label="用户名" align="center" prop="username" />
      <el-table-column label="部门编号" align="center" prop="bumenid" />
      <el-table-column label="部门名称" align="center" prop="bumenname" />
      <el-table-column label="角色编号" align="center" prop="roleid" />
      <el-table-column label="角色名" align="center" prop="rolename" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['car:shangpin:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['car:shangpin:remove']"
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

    <!-- 添加或修改商品对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="商品名称" prop="shangpinname">
          <el-input v-model="form.shangpinname" placeholder="请输入商品名称" />
        </el-form-item>
        <el-form-item label="商品标志0" prop="shangpinmark">
          <el-input v-model="form.shangpinmark" placeholder="请输入商品标志0" />
        </el-form-item>
        <el-form-item label="商品标志1" prop="shangpinmark1">
          <el-input v-model="form.shangpinmark1" placeholder="请输入商品标志1" />
        </el-form-item>
        <el-form-item label="商品标志2" prop="shangpinmark2">
          <el-input v-model="form.shangpinmark2" placeholder="请输入商品标志2" />
        </el-form-item>
        <el-form-item label="商品标志3" prop="shangpinmark3">
          <el-input v-model="form.shangpinmark3" placeholder="请输入商品标志3" />
        </el-form-item>
        <el-form-item label="日期" prop="shangpindate">
          <el-date-picker clearable
            v-model="form.shangpindate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="日期2" prop="shangpindate1">
          <el-date-picker clearable
            v-model="form.shangpindate1"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择日期2">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="商品库存" prop="shangpinzong">
          <el-input v-model="form.shangpinzong" placeholder="请输入商品库存" />
        </el-form-item>
        <el-form-item label="商品价格" prop="shangpinjin">
          <el-input v-model="form.shangpinjin" placeholder="请输入商品价格" />
        </el-form-item>
        <el-form-item label="商品销量" prop="shangpinxiao">
          <el-input v-model="form.shangpinxiao" placeholder="请输入商品销量" />
        </el-form-item>
        <el-form-item label="商品利润" prop="shangpinlirun">
          <el-input v-model="form.shangpinlirun" placeholder="请输入商品利润" />
        </el-form-item>
        <el-form-item label="商品类型2" prop="shangpintype1">
          <el-input v-model="form.shangpintype1" placeholder="请输入商品类型2" />
        </el-form-item>
        <el-form-item label="商品图片" prop="shangpinimg">
          <el-input v-model="form.shangpinimg" placeholder="请输入商品图片" />
        </el-form-item>
        <el-form-item label="商品图片名" prop="shangpinimgname">
          <el-input v-model="form.shangpinimgname" placeholder="请输入商品图片名" />
        </el-form-item>
        <el-form-item label="类型编号" prop="sptypeid">
          <el-input v-model="form.sptypeid" placeholder="请输入类型编号" />
        </el-form-item>
        <el-form-item label="类型名" prop="sptypename">
          <el-input v-model="form.sptypename" placeholder="请输入类型名" />
        </el-form-item>
        <el-form-item label="用户编号" prop="userid">
          <el-input v-model="form.userid" placeholder="请输入用户编号" />
        </el-form-item>
        <el-form-item label="用户名" prop="username">
          <el-input v-model="form.username" placeholder="请输入用户名" />
        </el-form-item>
        <el-form-item label="部门编号" prop="bumenid">
          <el-input v-model="form.bumenid" placeholder="请输入部门编号" />
        </el-form-item>
        <el-form-item label="部门名称" prop="bumenname">
          <el-input v-model="form.bumenname" placeholder="请输入部门名称" />
        </el-form-item>
        <el-form-item label="角色编号" prop="roleid">
          <el-input v-model="form.roleid" placeholder="请输入角色编号" />
        </el-form-item>
        <el-form-item label="角色名" prop="rolename">
          <el-input v-model="form.rolename" placeholder="请输入角色名" />
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
import { listShangpin, getShangpin, delShangpin, addShangpin, updateShangpin } from "@/api/car/shangpin";

export default {
  name: "Shangpin",
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
      // 商品表格数据
      shangpinList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        shangpinname: null,
        shangpinmark: null,
        shangpinmark1: null,
        shangpinmark2: null,
        shangpinmark3: null,
        shangpindate: null,
        shangpindate1: null,
        shangpinzong: null,
        shangpinjin: null,
        shangpinxiao: null,
        shangpinlirun: null,
        shangpintype: null,
        shangpintype1: null,
        shangpinimg: null,
        shangpinimgname: null,
        sptypeid: null,
        sptypename: null,
        userid: null,
        username: null,
        bumenid: null,
        bumenname: null,
        roleid: null,
        rolename: null
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
    /** 查询商品列表 */
    getList() {
      this.loading = true;
      listShangpin(this.queryParams).then(response => {
        this.shangpinList = response.rows;
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
        shangpinid: null,
        shangpinname: null,
        shangpinmark: null,
        shangpinmark1: null,
        shangpinmark2: null,
        shangpinmark3: null,
        shangpindate: null,
        shangpindate1: null,
        shangpinzong: null,
        shangpinjin: null,
        shangpinxiao: null,
        shangpinlirun: null,
        shangpintype: null,
        shangpintype1: null,
        shangpinimg: null,
        shangpinimgname: null,
        sptypeid: null,
        sptypename: null,
        userid: null,
        username: null,
        bumenid: null,
        bumenname: null,
        roleid: null,
        rolename: null
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
      this.ids = selection.map(item => item.shangpinid)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加商品";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const shangpinid = row.shangpinid || this.ids
      getShangpin(shangpinid).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改商品";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.shangpinid != null) {
            updateShangpin(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addShangpin(this.form).then(response => {
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
      const shangpinids = row.shangpinid || this.ids;
      this.$modal.confirm('是否确认删除商品编号为"' + shangpinids + '"的数据项？').then(function() {
        return delShangpin(shangpinids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('car/shangpin/export', {
        ...this.queryParams
      }, `shangpin_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
