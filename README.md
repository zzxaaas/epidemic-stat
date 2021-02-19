# epidemic-stat

已部署服务器

[链接](http://81.68.122.122:8081/)

### 数据采集

[用友api](https://api.yonyoucloud.com/apilink/tempServicePages/260492aa-6dbd-49f6-b82a-8a463b73ac33_true.html)

### 数据处理

用springboot搭建后端服务器 获取、处理数据

前端像服务器请求疫情统计数据，服务器在向用友的api请求获取数据。

获取到数据后，对数据进行处理在响应给前端。

前端需要的geojson文件用nginx进行代理，

前端通过ajax就能获取到服务器上的geojson文件

### 数据展示

通过echarts进行展示