import request from '@/utils/request'

// 查询商品列表
export function listShangpin(query) {
  return request({
    url: '/car/shangpin/list',
    method: 'get',
    params: query
  })
}

// 查询商品详细
export function getShangpin(shangpinid) {
  return request({
    url: '/car/shangpin/' + shangpinid,
    method: 'get'
  })
}

// 新增商品
export function addShangpin(data) {
  return request({
    url: '/car/shangpin',
    method: 'post',
    data: data
  })
}

// 修改商品
export function updateShangpin(data) {
  return request({
    url: '/car/shangpin',
    method: 'put',
    data: data
  })
}

// 删除商品
export function delShangpin(shangpinid) {
  return request({
    url: '/car/shangpin/' + shangpinid,
    method: 'delete'
  })
}
