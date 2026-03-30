# Bonfire Voxy Bridge (Fabric)

![License](https://img.shields.io/badge/license-BNSL--1.0-red)
![Commercial Use](https://img.shields.io/badge/commercial-use%20by%20written%20permission%20only-critical)
![Platform](https://img.shields.io/badge/platform-Fabric%201.21.8-brightgreen)
![Side](https://img.shields.io/badge/side-client-blueviolet)
![Java](https://img.shields.io/badge/java-21-orange)

Bonfire Voxy Bridge is a Fabric client companion that forces Voxy multiplayer saves into one shared Bonfire map root instead of splitting cache data by domain or IP.

## What It Changes

- Redirects Voxy multiplayer save resolution into a shared Bonfire path.
- Prevents duplicate map cache trees when the same server is reached through multiple entry points.
- Keeps singleplayer behavior untouched.

## Compatibility

- Minecraft Java `1.21.8`
- Fabric Loader `0.18.3+`
- Voxy `0.2.5-alpha`
- Java `21`

## Build

```powershell
.\gradlew.bat build
```

## Repository Scope

- Source only.
- Generated jars, remapped outputs, and local run data are excluded from Git.

## License

Bonfire Non-Commercial Source License 1.0

Commercial use is prohibited unless you first obtain written permission from `mingxi7707@qq.com`.
