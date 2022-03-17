# WebPOS

 完善功能：商品右下角的添加购物车按钮，购物车商品数量+、-按钮以及Delete按钮，购物车商品总价，购物车empty按钮（清空）和charge按钮

①商品添加

![md-1](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcU4Wfu.uVPyaIf8v8EoUhwC46fzc.wQ86mrgPsOEU6RtQl8gbOeks4*pUUlcIKa19g5JA89mvojLmkNPToGuAxU!/b&bo=BQb0AgAAAAADN.c!&rf=viewer_4)

②商品购买

![md-2](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcU4Wfu.uVPyaIf8v8EoUhwBT1qfj8J9yGdzi9L52gKE.ZeKh0jOMaay8X09P5GcNYImLkcYVG5EbTYzeI7LNjz4!/b&bo=.wXYAgAAAAABFxQ!&rf=viewer_4)

# 对MVC框架的理解
 MVC即Model、View、Controller，即模型、视图、控制器。

 MVC要实现的目标是将软件用户界面和业务逻辑分离，以使代码可扩展性、可复用性、可维护性、灵活性加强。在网页中，View视图指用户看到并与之交互的视图，Model模型指
 模型表示业务规则，Controller控制器指控制器接受用户的输入并调用模型和视图去完成用户的需求，控制器本身并不输出任何东西和做任何处理，它只接受请求并决定调用
 哪个模型去处理请求，然后再确定用哪个视图来显示返回的数据。