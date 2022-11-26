import request from '@/utils/request'

// 查询失败订单列表
export function listFail(query) {
  return request({
    url: '/charge/fail/list',
    method: 'get',
    params: query
  })
}

// 查询失败订单详细
export function getFail(id) {
  return request({
    url: '/charge/fail/' + id,
    method: 'get'
  })
}

// 新增失败订单
export function addFail(data) {
  return request({
    url: '/charge/fail',
    method: 'post',
    data: data
  })
}

// 修改失败订单
export function updateFail(data) {
  return request({
    url: '/charge/fail',
    method: 'put',
    data: data
  })
}

// 删除失败订单
export function delFail(id) {
  return request({
    url: '/charge/fail/' + id,
    method: 'delete'
  })
}
