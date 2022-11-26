import request from '@/utils/request'

// 查询成功订单列表
export function listSucces(query) {
  return request({
    url: '/charge/succes/list',
    method: 'get',
    params: query
  })
}

// 查询成功订单详细
export function getSucces(id) {
  return request({
    url: '/charge/succes/' + id,
    method: 'get'
  })
}

// 新增成功订单
export function addSucces(data) {
  return request({
    url: '/charge/succes',
    method: 'post',
    data: data
  })
}

// 修改成功订单
export function updateSucces(data) {
  return request({
    url: '/charge/succes',
    method: 'put',
    data: data
  })
}

// 删除成功订单
export function delSucces(id) {
  return request({
    url: '/charge/succes/' + id,
    method: 'delete'
  })
}
