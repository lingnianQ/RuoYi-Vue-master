<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="桩编号" prop="pileNumber">
        <el-input
          v-model="queryParams.pileNumber"
          placeholder="请输入桩编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="桩名称" prop="pileName">
        <el-input
          v-model="queryParams.pileName"
          placeholder="请输入桩名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="枪编号[]" prop="gunInfos">
        <el-input
          v-model="queryParams.gunInfos"
          placeholder="请输入枪编号[]"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="额定总功率" prop="power">
        <el-input
          v-model="queryParams.power"
          placeholder="请输入额定总功率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备型号" prop="pileModel">
        <el-input
          v-model="queryParams.pileModel"
          placeholder="请输入设备型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="协议" prop="protocol">
        <el-input
          v-model="queryParams.protocol"
          placeholder="请输入协议"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网络" prop="network">
        <el-input
          v-model="queryParams.network"
          placeholder="请输入网络"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经度" prop="pileLng">
        <el-input
          v-model="queryParams.pileLng"
          placeholder="请输入经度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="纬度" prop="pileLat">
        <el-input
          v-model="queryParams.pileLat"
          placeholder="请输入纬度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="场站ID" prop="stationId">
        <el-input
          v-model="queryParams.stationId"
          placeholder="请输入场站ID"
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
          v-hasPermi="['charge:pile:add']"
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
          v-hasPermi="['charge:pile:edit']"
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
          v-hasPermi="['charge:pile:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['charge:pile:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="pileList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="桩编号" align="center" prop="pileNumber" />
      <el-table-column label="桩名称" align="center" prop="pileName" />
      <el-table-column label="枪编号[]" align="center" prop="gunInfos" />
      <el-table-column label="额定总功率" align="center" prop="power" />
      <el-table-column label="设备类型(直/交流、交直一体、其它)" align="center" prop="pileType" />
      <el-table-column label="设备型号" align="center" prop="pileModel" />
      <el-table-column label="协议" align="center" prop="protocol" />
      <el-table-column label="网络" align="center" prop="network" />
      <el-table-column label="经度" align="center" prop="pileLng" />
      <el-table-column label="纬度" align="center" prop="pileLat" />
      <el-table-column label="场站ID" align="center" prop="stationId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['charge:pile:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['charge:pile:remove']"
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

    <!-- 添加或修改充电桩对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="桩编号" prop="pileNumber">
          <el-input v-model="form.pileNumber" placeholder="请输入桩编号" />
        </el-form-item>
        <el-form-item label="桩名称" prop="pileName">
          <el-input v-model="form.pileName" placeholder="请输入桩名称" />
        </el-form-item>
        <el-form-item label="枪编号[]" prop="gunInfos">
          <el-input v-model="form.gunInfos" placeholder="请输入枪编号[]" />
        </el-form-item>
        <el-form-item label="额定总功率" prop="power">
          <el-input v-model="form.power" placeholder="请输入额定总功率" />
        </el-form-item>
        <el-form-item label="设备型号" prop="pileModel">
          <el-input v-model="form.pileModel" placeholder="请输入设备型号" />
        </el-form-item>
        <el-form-item label="协议" prop="protocol">
          <el-input v-model="form.protocol" placeholder="请输入协议" />
        </el-form-item>
        <el-form-item label="网络" prop="network">
          <el-input v-model="form.network" placeholder="请输入网络" />
        </el-form-item>
        <el-form-item label="经度" prop="pileLng">
          <el-input v-model="form.pileLng" placeholder="请输入经度" />
        </el-form-item>
        <el-form-item label="纬度" prop="pileLat">
          <el-input v-model="form.pileLat" placeholder="请输入纬度" />
        </el-form-item>
        <el-form-item label="场站ID" prop="stationId">
          <el-input v-model="form.stationId" placeholder="请输入场站ID" />
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
import { listPile, getPile, delPile, addPile, updatePile } from "@/api/charge/pile";

export default {
  name: "Pile",
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
      // 充电桩表格数据
      pileList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        pileNumber: null,
        pileName: null,
        gunInfos: null,
        power: null,
        pileType: null,
        pileModel: null,
        protocol: null,
        network: null,
        pileLng: null,
        pileLat: null,
        stationId: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        pileNumber: [
          { required: true, message: "桩编号不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询充电桩列表 */
    getList() {
      this.loading = true;
      listPile(this.queryParams).then(response => {
        this.pileList = response.rows;
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
        pileNumber: null,
        pileName: null,
        gunInfos: null,
        power: null,
        pileType: null,
        pileModel: null,
        protocol: null,
        network: null,
        pileLng: null,
        pileLat: null,
        stationId: null,
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
      this.title = "添加充电桩";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getPile(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改充电桩";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updatePile(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addPile(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除充电桩编号为"' + ids + '"的数据项？').then(function() {
        return delPile(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('charge/pile/export', {
        ...this.queryParams
      }, `pile_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
