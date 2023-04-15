import request from '@/utils/request'

// 查询员工信息列表
export function listSpgys(query) {
  return request({
    url: '/car/spgys/list',
    method: 'get',
    params: query
  })
}

// 查询员工信息详细
export function getSpgys(spgysid) {
  return request({
    url: '/car/spgys/' + spgysid,
    method: 'get'
  })
}

// 新增员工信息
export function addSpgys(data) {
  return request({
    url: '/car/spgys',
    method: 'post',
    data: data
  })
}

// 修改员工信息
export function updateSpgys(data) {
  return request({
    url: '/car/spgys',
    method: 'put',
    data: data
  })
}

// 删除员工信息
export function delSpgys(spgysid) {
  return request({
    url: '/car/spgys/' + spgysid,
    method: 'delete'
  })
}
