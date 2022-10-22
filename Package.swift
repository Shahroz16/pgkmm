// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/Shahroz16/pgkmm/releases/assets/81915482.zip"
let remoteKotlinChecksum = "a6a264a2aa099973e23ee82d0f4ca234955c4d8b6475cc19b47c9133e8ff6cba"
let packageName = "shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)