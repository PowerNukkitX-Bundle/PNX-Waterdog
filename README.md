# PNX-Waterdog

WaterdogPE proxy support plugin for PowerNukkitX.

## Usage

- Build: `./gradlew build` (jar at `build/libs/PNX-Waterdog-1.0.0.jar`)
- Drop the jar into the server's `plugins` folder
- Enables unsigned login chains (proxy strips the Mojang signature) and reads the player XUID from `Waterdog_XUID` in the login chain
- Also disables the login time check, since the proxy re-signs login data

## Warning

- Only install this behind a WaterdogPE proxy. With this plugin active, the server accepts unsigned login chains, so it must not be directly reachable from the internet.
