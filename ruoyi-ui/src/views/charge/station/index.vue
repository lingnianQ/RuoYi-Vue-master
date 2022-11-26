<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="站场编码" prop="stationCode">
        <el-input
          v-model="queryParams.stationCode"
          placeholder="请输入站场编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="场站名称" prop="stationName">
        <el-input
          v-model="queryParams.stationName"
          placeholder="请输入场站名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="充电桩数" prop="deviceNumber">
        <el-input
          v-model="queryParams.deviceNumber"
          placeholder="请输入充电桩数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交流充电枪数" prop="acGunNumber">
        <el-input
          v-model="queryParams.acGunNumber"
          placeholder="请输入交流充电枪数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="直流充电枪数" prop="dcGunNumber">
        <el-input
          v-model="queryParams.dcGunNumber"
          placeholder="请输入直流充电枪数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交流额定功率" prop="acRatePower">
        <el-input
          v-model="queryParams.acRatePower"
          placeholder="请输入交流额定功率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="直流额定功率" prop="dcRatePower">
        <el-input
          v-model="queryParams.dcRatePower"
          placeholder="请输入直流额定功率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="省份编码" prop="province">
        <el-input
          v-model="queryParams.province"
          placeholder="请输入省份编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="城市编码" prop="city">
        <el-input
          v-model="queryParams.city"
          placeholder="请输入城市编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="详细地址" prop="address">
        <el-input
          v-model="queryParams.address"
          placeholder="请输入详细地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="经度" prop="stationLng">
        <el-input
          v-model="queryParams.stationLng"
          placeholder="请输入经度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="纬度" prop="stationLat">
        <el-input
          v-model="queryParams.stationLat"
          placeholder="请输入纬度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备功率" prop="devicePower">
        <el-input
          v-model="queryParams.devicePower"
          placeholder="请输入设备功率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="场站模式" prop="stationModel">
        <el-input
          v-model="queryParams.stationModel"
          placeholder="请输入场站模式"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="记录调整时间" prop="stationModified">
        <el-date-picker clearable
          v-model="queryParams.stationModified"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择记录调整时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="记录创建时间" prop="stationCreate">
        <el-date-picker clearable
          v-model="queryParams.stationCreate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择记录创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="运营商ID" prop="operatorId">
        <el-input
          v-model="queryParams.operatorId"
          placeholder="请输入运营商ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="停车费" prop="parkFee">
        <el-input
          v-model="queryParams.parkFee"
          placeholder="请输入停车费"
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
          v-hasPermi="['charge:station:add']"
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
          v-hasPermi="['charge:station:edit']"
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
          v-hasPermi="['charge:station:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['charge:station:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="stationList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主ID" align="center" prop="id" />
      <el-table-column label="站场编码" align="center" prop="stationCode" />
      <el-table-column label="场站名称" align="center" prop="stationName" />
      <el-table-column label="充电桩数" align="center" prop="deviceNumber" />
      <el-table-column label="交流充电枪数" align="center" prop="acGunNumber" />
      <el-table-column label="直流充电枪数" align="center" prop="dcGunNumber" />
      <el-table-column label="交流额定功率" align="center" prop="acRatePower" />
      <el-table-column label="直流额定功率" align="center" prop="dcRatePower" />
      <el-table-column label="省份编码" align="center" prop="province" />
      <el-table-column label="城市编码" align="center" prop="city" />
      <el-table-column label="详细地址" align="center" prop="address" />
      <el-table-column label="经度" align="center" prop="stationLng" />
      <el-table-column label="纬度" align="center" prop="stationLat" />
      <el-table-column label="设备功率" align="center" prop="devicePower" />
      <el-table-column label="场站模式" align="center" prop="stationModel" />
      <el-table-column label="场站状态" align="center" prop="stationStatus" />
      <el-table-column label="场站类型" align="center" prop="stationType" />
      <el-table-column label="记录调整时间" align="center" prop="stationModified" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.stationModified, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="记录创建时间" align="center" prop="stationCreate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.stationCreate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="运营商ID" align="center" prop="operatorId" />
      <el-table-column label="停车费" align="center" prop="parkFee" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['charge:station:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['charge:station:remove']"
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

    <!-- 添加或修改充电站对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="站场编码" prop="stationCode">
          <el-input v-model="form.stationCode" placeholder="请输入站场编码" />
        </el-form-item>
        <el-form-item label="场站名称" prop="stationName">
          <el-input v-model="form.stationName" placeholder="请输入场站名称" />
        </el-form-item>
        <el-form-item label="充电桩数" prop="deviceNumber">
          <el-input v-model="form.deviceNumber" placeholder="请输入充电桩数" />
        </el-form-item>
        <el-form-item label="交流充电枪数" prop="acGunNumber">
          <el-input v-model="form.acGunNumber" placeholder="请输入交流充电枪数" />
        </el-form-item>
        <el-form-item label="直流充电枪数" prop="dcGunNumber">
          <el-input v-model="form.dcGunNumber" placeholder="请输入直流充电枪数" />
        </el-form-item>
        <el-form-item label="交流额定功率" prop="acRatePower">
          <el-input v-model="form.acRatePower" placeholder="请输入交流额定功率" />
        </el-form-item>
        <el-form-item label="直流额定功率" prop="dcRatePower">
          <el-input v-model="form.dcRatePower" placeholder="请输入直流额定功率" />
        </el-form-item>
        <el-form-item label="省份编码" prop="province">
          <el-input v-model="form.province" placeholder="请输入省份编码" />
        </el-form-item>
        <el-form-item label="城市编码" prop="city">
          <el-input v-model="form.city" placeholder="请输入城市编码" />
        </el-form-item>
        <el-form-item label="详细地址" prop="address">
          <el-input v-model="form.address" placeholder="请输入详细地址" />
        </el-form-item>
        <el-form-item label="经度" prop="stationLng">
          <el-input v-model="form.stationLng" placeholder="请输入经度" />
        </el-form-item>
        <el-form-item label="纬度" prop="stationLat">
          <el-input v-model="form.stationLat" placeholder="请输入纬度" />
        </el-form-item>
        <el-form-item label="设备功率" prop="devicePower">
          <el-input v-model="form.devicePower" placeholder="请输入设备功率" />
        </el-form-item>
        <el-form-item label="场站模式" prop="stationModel">
          <el-input v-model="form.stationModel" placeholder="请输入场站模式" />
        </el-form-item>
        <el-form-item label="记录调整时间" prop="stationModified">
          <el-date-picker clearable
            v-model="form.stationModified"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择记录调整时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="记录创建时间" prop="stationCreate">
          <el-date-picker clearable
            v-model="form.stationCreate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择记录创建时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="运营商ID" prop="operatorId">
          <el-input v-model="form.operatorId" placeholder="请输入运营商ID" />
        </el-form-item>
        <el-form-item label="停车费" prop="parkFee">
          <el-input v-model="form.parkFee" placeholder="请输入停车费" />
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
import { listStation, getStation, delStation, addStation, updateStation } from "@/api/charge/station";

export default {
  name: "Station",
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
      // 充电站表格数据
      stationList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        stationCode: null,
        stationName: null,
        deviceNumber: null,
        acGunNumber: null,
        dcGunNumber: null,
        acRatePower: null,
        dcRatePower: null,
        province: null,
        city: null,
        address: null,
        stationLng: null,
        stationLat: null,
        devicePower: null,
        stationModel: null,
        stationStatus: null,
        stationType: null,
        stationModified: null,
        stationCreate: null,
        operatorId: null,
        parkFee: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        stationCode: [
          { required: true, message: "站场编码不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询充电站列表 */
    getList() {
      this.loading = true;
      listStation(this.queryParams).then(response => {
        this.stationList = response.rows;
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
        stationCode: null,
        stationName: null,
        deviceNumber: null,
        acGunNumber: null,
        dcGunNumber: null,
        acRatePower: null,
        dcRatePower: null,
        province: null,
        city: null,
        address: null,
        stationLng: null,
        stationLat: null,
        devicePower: null,
        stationModel: null,
        stationStatus: 0,
        stationType: null,
        stationModified: null,
        stationCreate: null,
        operatorId: null,
        parkFee: null
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
      this.title = "添加充电站";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getStation(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改充电站";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateStation(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addStation(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除充电站编号为"' + ids + '"的数据项？').then(function() {
        return delStation(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('charge/station/export', {
        ...this.queryParams
      }, `station_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
