import request from '@/utils/request'

// 查询运营商列表
export function listOperator(query) {
  return request({
    url: '/charge/operator/list',
    method: 'get',
    params: query
  })
}

// 查询运营商详细
export function getOperator(id) {
  return request({
    url: '/charge/operator/' + id,
    method: 'get'
  })
}

// 新增运营商
export function addOperator(data) {
  return request({
    url: '/charge/operator',
    method: 'post',
    data: data
  })
}

// 修改运营商
export function updateOperator(data) {
  return request({
    url: '/charge/operator',
    method: 'put',
    data: data
  })
}

// 删除运营商
export function delOperator(id) {
  return request({
    url: '/charge/operator/' + id,
    method: 'delete'
  })
}
