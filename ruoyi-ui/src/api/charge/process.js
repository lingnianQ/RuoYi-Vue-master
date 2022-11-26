import request from '@/utils/request'

// 查询进行订单列表
export function listProcess(query) {
  return request({
    url: '/charge/process/list',
    method: 'get',
    params: query
  })
}

// 查询进行订单详细
export function getProcess(id) {
  return request({
    url: '/charge/process/' + id,
    method: 'get'
  })
}

// 新增进行订单
export function addProcess(data) {
  return request({
    url: '/charge/process',
    method: 'post',
    data: data
  })
}

// 修改进行订单
export function updateProcess(data) {
  return request({
    url: '/charge/process',
    method: 'put',
    data: data
  })
}

// 删除进行订单
export function delProcess(id) {
  return request({
    url: '/charge/process/' + id,
    method: 'delete'
  })
}
