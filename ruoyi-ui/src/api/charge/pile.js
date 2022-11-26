import request from '@/utils/request'

// 查询充电桩列表
export function listPile(query) {
  return request({
    url: '/charge/pile/list',
    method: 'get',
    params: query
  })
}

// 查询充电桩详细
export function getPile(id) {
  return request({
    url: '/charge/pile/' + id,
    method: 'get'
  })
}

// 新增充电桩
export function addPile(data) {
  return request({
    url: '/charge/pile',
    method: 'post',
    data: data
  })
}

// 修改充电桩
export function updatePile(data) {
  return request({
    url: '/charge/pile',
    method: 'put',
    data: data
  })
}

// 删除充电桩
export function delPile(id) {
  return request({
    url: '/charge/pile/' + id,
    method: 'delete'
  })
}
