import request from '@/utils/request'

// 查询车辆信息列表
export function listSpcangku(query) {
  return request({
    url: '/car/spcangku/list',
    method: 'get',
    params: query
  })
}

// 查询车辆信息详细
export function getSpcangku(spcangkuid) {
  return request({
    url: '/car/spcangku/' + spcangkuid,
    method: 'get'
  })
}

// 新增车辆信息
export function addSpcangku(data) {
  return request({
    url: '/car/spcangku',
    method: 'post',
    data: data
  })
}

// 修改车辆信息
export function updateSpcangku(data) {
  return request({
    url: '/car/spcangku',
    method: 'put',
    data: data
  })
}

// 删除车辆信息
export function delSpcangku(spcangkuid) {
  return request({
    url: '/car/spcangku/' + spcangkuid,
    method: 'delete'
  })
}
