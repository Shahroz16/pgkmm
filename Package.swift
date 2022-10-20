// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/Shahroz16/pgkmm/releases/assets/81720803.zip"
let remoteKotlinChecksum = "a4b54a4c40f16b7e84ae0d36bbfe93ad817bf56cb222083c127be82d0dfa7f65"
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