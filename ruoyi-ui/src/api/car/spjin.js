import request from '@/utils/request'

// 查询地址信息列表
export function listSpjin(query) {
  return request({
    url: '/car/spjin/list',
    method: 'get',
    params: query
  })
}

// 查询地址信息详细
export function getSpjin(spjinid) {
  return request({
    url: '/car/spjin/' + spjinid,
    method: 'get'
  })
}

// 新增地址信息
export function addSpjin(data) {
  return request({
    url: '/car/spjin',
    method: 'post',
    data: data
  })
}

// 修改地址信息
export function updateSpjin(data) {
  return request({
    url: '/car/spjin',
    method: 'put',
    data: data
  })
}

// 删除地址信息
export function delSpjin(spjinid) {
  return request({
    url: '/car/spjin/' + spjinid,
    method: 'delete'
  })
}
