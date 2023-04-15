import request from '@/utils/request'

// 查询区域信息列表
export function listSptype(query) {
  return request({
    url: '/car/sptype/list',
    method: 'get',
    params: query
  })
}

// 查询区域信息详细
export function getSptype(sptypeid) {
  return request({
    url: '/car/sptype/' + sptypeid,
    method: 'get'
  })
}

// 新增区域信息
export function addSptype(data) {
  return request({
    url: '/car/sptype',
    method: 'post',
    data: data
  })
}

// 修改区域信息
export function updateSptype(data) {
  return request({
    url: '/car/sptype',
    method: 'put',
    data: data
  })
}

// 删除区域信息
export function delSptype(sptypeid) {
  return request({
    url: '/car/sptype/' + sptypeid,
    method: 'delete'
  })
}
