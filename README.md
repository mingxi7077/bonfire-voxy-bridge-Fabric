# Bonfire Voxy Bridge (Fabric)

[English](#english) | [简体中文](#简体中文)

Bonfire Voxy Bridge is a Fabric client companion for unified Voxy multiplayer cache storage.

Bonfire Voxy Bridge 是一个用于统一 Voxy 多人缓存目录的 Fabric 客户端附属模组。

---

## English

Bonfire Voxy Bridge is a Fabric client companion that forces Voxy multiplayer saves into one shared Bonfire map root instead of splitting cache data by domain or IP.

### What It Changes

- Redirects Voxy multiplayer save resolution into a shared Bonfire path.
- Prevents duplicate map cache trees when the same server is reached through multiple entry points.
- Keeps singleplayer behavior untouched.

### Compatibility

- Minecraft Java `1.21.8`
- Fabric Loader `0.18.3+`
- Voxy `0.2.5-alpha`
- Java `21`

### Repository Layout

- `src/`: mod source code
- `build.gradle`: Gradle build definition
- `build/`: generated output, excluded from release tracking

### Build

```powershell
.\gradlew.bat build
```

### License

This repository currently uses the `Bonfire Non-Commercial Source License 1.0`.
See [LICENSE](LICENSE) for the exact terms.

---

## 简体中文

Bonfire Voxy Bridge 是一个 Fabric 客户端附属模组，用于强制把 Voxy 的多人缓存写入统一的 Bonfire 地图根目录，而不是按域名或 IP 分裂出多份缓存树。

### 它修改了什么

- 将 Voxy 的多人缓存路径重定向到共享的 Bonfire 目录。
- 避免同一服务器通过不同入口访问时产生重复缓存树。
- 保持单人模式行为不变。

### 兼容性

- Minecraft Java `1.21.8`
- Fabric Loader `0.18.3+`
- Voxy `0.2.5-alpha`
- Java `21`

### 仓库结构

- `src/`：模组源码
- `build.gradle`：Gradle 构建定义
- `build/`：生成输出，不纳入发布源码

### 构建方式

```powershell
.\gradlew.bat build
```

### 授权

本仓库当前采用 `Bonfire Non-Commercial Source License 1.0`。
具体条款见 [LICENSE](LICENSE)。
