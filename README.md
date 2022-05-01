# mpp-serialisation
Reproduction of kotlinx-serialization issue (see https://github.com/Kotlin/kotlinx.serialization/issues/1914)

## To reproduce

1. `./gradlew jvmTest` - All pass
2. `./gradelw iosX64Test` - Crashes with a segfault

```shell
> Task :iosX64Test FAILED
Child process terminated with signal 11: Segmentation fault

BasketTest.Basket Transformer.from DTO.should convert DTO FAILED
    Unknown

1 test completed, 1 failed
```
