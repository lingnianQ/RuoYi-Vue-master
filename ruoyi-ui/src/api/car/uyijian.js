import request from '@/utils/request'

// 查询评价列表
export function listUyijian(query) {
  return request({
    url: '/car/uyijian/list',
    method: 'get',
    params: query
  })
}

// 查询评价详细
export function getUyijian(uyijianid) {
  return request({
    url: '/car/uyijian/' + uyijianid,
    method: 'get'
  })
}

// 新增评价
export function addUyijian(data) {
  return request({
    url: '/car/uyijian',
    method: 'post',
    data: data
  })
}

// 修改评价
export function updateUyijian(data) {
  return request({
    url: '/car/uyijian',
    method: 'put',
    data: data
  })
}

// 删除评价
export function delUyijian(uyijianid) {
  return request({
    url: '/car/uyijian/' + uyijianid,
    method: 'delete'
  })
}
