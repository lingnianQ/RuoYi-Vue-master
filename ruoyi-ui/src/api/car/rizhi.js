import request from '@/utils/request'

// 查询日志列表
export function listRizhi(query) {
  return request({
    url: '/car/rizhi/list',
    method: 'get',
    params: query
  })
}

// 查询日志详细
export function getRizhi(rizhiid) {
  return request({
    url: '/car/rizhi/' + rizhiid,
    method: 'get'
  })
}

// 新增日志
export function addRizhi(data) {
  return request({
    url: '/car/rizhi',
    method: 'post',
    data: data
  })
}

// 修改日志
export function updateRizhi(data) {
  return request({
    url: '/car/rizhi',
    method: 'put',
    data: data
  })
}

// 删除日志
export function delRizhi(rizhiid) {
  return request({
    url: '/car/rizhi/' + rizhiid,
    method: 'delete'
  })
}
