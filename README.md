# 客户信息管理软件
 
- 模拟实现一个基于文本界面的《客户信息管理软件》

## 软件设计结构

该软件由以下三个模块组成：

![CustomerView](https://github.com/PlutoaCharon/CustomerView/blob/master/Images/1.png)

- CustomerView为主模块，负责菜单的显示和处理用户操作
- CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
- Customer为实体对象，用来封装客户信息
- CMUtility为工具类

![CustomerView](https://github.com/PlutoaCharon/CustomerView/blob/master/Images/CustomerView.png)
