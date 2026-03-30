# Bonfire Voxy Bridge (Fabric)

Bonfire 专用的 Fabric 附属模组。

它会在 **多人联机** 时拦截 `VoxyClientInstance.getBasePath()`，把 Voxy 原本按服务器域名区分的保存根目录统一改为：

`<游戏目录>/.voxy/saves/bonfire`

这样多个域名、分流入口、备用线路进入时，都会共用同一套 Voxy 地图缓存。

## 目标环境

- Minecraft Java `1.21.8`
- Fabric Loader `0.18.3`
- Voxy `0.2.5-alpha`
- Java `21`

## 当前行为

- 单人世界：保持 Voxy 原逻辑，不改路径
- 多人联机：固定到 `.voxy/saves/bonfire`
- 不再按服务器域名拆分 Voxy 缓存

## 构建

Windows:

```bat
gradlew.bat build
```

产物位置：

`build/libs/bonfire-voxy-bridge-fabric-0.1.0+1.21.8.jar`

## 部署

把构建出的 jar 放进客户端对应版本的 `mods` 文件夹，同时保证 `Voxy` 已安装。

## 说明

这个工程当前是 **Bonfire 特供版**，固定使用 `bonfire` 作为多人缓存目录名。
如果后续你要改成配置文件版，我可以继续补一版可调目录名的实现。
