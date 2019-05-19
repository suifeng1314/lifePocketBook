Page({
  data:{
    indextext:'登录',
    name:"qq",
    avatar:""
  },
  onLoad(query) {
    // 页面加载
    console.info(`Page onLoad with query: ${JSON.stringify(query)}`);

          my.getAuthCode({
              scopes: 'auth_user', // 主动授权（弹框）：auth_user，静默授权（不弹框）：auth_base
              success: (res) => {
                console.log(res);
                  my.getAuthUserInfo({
                    success: (userInfo) => {
                          this.setData({
                            name:userInfo.nickName,
                            avatar: userInfo.avatar
                          })
  
                      // my.alert({
                      // content: userInfo.nickName+userInfo.avatar
                      // });
                    }
                });
            
              },
              fail:(err) => {
                console.log(err);
              }
      });
  },
  onReady() {
    // 页面加载完成
  },
  onShow() {
    // 页面显示
  },
  onHide() {
    // 页面隐藏
  },
  onUnload() {
    // 页面被关闭
  },
  onTitleClick() {
    // 标题被点击
  },
  onPullDownRefresh() {
    // 页面被下拉
  },
  onReachBottom() {
    // 页面被拉到底部
  },
  onShareAppMessage() {
    // 返回自定义分享信息
    return {
      title: 'My App',
      desc: 'My App description',
      path: 'pages/index/index',
    };
  },
getAuthCode(){
  my.getAuthCode({
  scopes: 'auth_user', // 主动授权（弹框）：auth_user，静默授权（不弹框）：auth_base
  success: (res) => {
      my.getAuthUserInfo({
        success: (userInfo) => {
           this.name = userInfo.nickName;
           this.avatar= userInfo.avatar;
          console.log(userInfo.nickName+userInfo.avatar);
          // my.alert({
          // content: userInfo.nickName+userInfo.avatar
          // });
        }
     });
  if (res.authCode) {
    console.log(res);
    // 认证成功
    // 调用自己的服务端接口，让服务端进行后端的授权认证，并且种session，需要解决跨域问题
    my.httpRequest({
      url: 'http://192.168.3.5', // 该url是自己的服务地址，实现的功能是服务端拿到authcode去开放平台进行token验证
      data: {
        authcode: res.authCode
      },
      success: (res) => {
        // 授权成功并且服务器端登录成功
        console.log(res);
      },
      fail: (err) => {
        // 根据自己的业务场景来进行错误处理
         console.log(err);
      },
    });
  }
  },
  });
}

});
