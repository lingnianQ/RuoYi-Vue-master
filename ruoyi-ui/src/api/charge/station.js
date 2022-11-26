import request from '@/utils/request'

// 查询充电站列表
export function listStation(query) {
  return request({
    url: '/charge/station/list',
    method: 'get',
    params: query
  })
}

// 查询充电站详细
export function getStation(id) {
  return request({
    url: '/charge/station/' + id,
    method: 'get'
  })
}

// 新增充电站
export function addStation(data) {
  return request({
    url: '/charge/station',
    method: 'post',
    data: data
  })
}

// 修改充电站
export function updateStation(data) {
  return request({
    url: '/charge/station',
    method: 'put',
    data: data
  })
}

// 删除充电站
export function delStation(id) {
  return request({
    url: '/charge/station/' + id,
    method: 'delete'
  })
}
