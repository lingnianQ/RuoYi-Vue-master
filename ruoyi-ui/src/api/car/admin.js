import request from '@/utils/request'

// 查询管理员列表
export function listAdmin(query) {
  return request({
    url: '/car/admin/list',
    method: 'get',
    params: query
  })
}

// 查询管理员详细
export function getAdmin(adminid) {
  return request({
    url: '/car/admin/' + adminid,
    method: 'get'
  })
}

// 新增管理员
export function addAdmin(data) {
  return request({
    url: '/car/admin',
    method: 'post',
    data: data
  })
}

// 修改管理员
export function updateAdmin(data) {
  return request({
    url: '/car/admin',
    method: 'put',
    data: data
  })
}

// 删除管理员
export function delAdmin(adminid) {
  return request({
    url: '/car/admin/' + adminid,
    method: 'delete'
  })
}
