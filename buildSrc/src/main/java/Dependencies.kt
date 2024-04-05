object Dependencies {
    //implementation("androidx.core:core-ktx:1.9.0")

   /* implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")*/

    val coreKtx = {"androidx.core:core-ktx:${Versions.coreKtx}"}
    val lifecycleRuntimeKtx = {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
    val activityCompose = {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom = {"androidx.compose:compose-bom:2023.03.00"}
    val composeUi = {"androidx.compose.ui:ui"}
    val composeUiGraphics = {"androidx.compose.ui:ui-graphics"}
    val composeUiToolingPreview = {"androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 = {"androidx.compose.material3:material3"}
    val junitJunit = {"junit:junit:${Versions.junitJunit}"}
    val testExtJunit = {"androidx.test.ext:junit:${Versions.testExtJunit}"}
    val testEspressoEspressoCore = {"androidx.test.espresso:espresso-core:${Versions.testEspressoEspressoCore}"}
    val composeComposeBom = {("androidx.compose:compose-bom:2023.03.00")}
    val composeUiUiTestJunit4 = {"androidx.compose.ui:ui-test-junit4"}
    val composeUiUiTooling = {"androidx.compose.ui:ui-tooling"}
    val composeUiUiTestManifest = {"androidx.compose.ui:ui-test-manifest"}
    val hiltAndroid = { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidCompiler = { "com.google.dagger:hilt-android-compiler:${Versions.androidCompiler}"}
    val hiltCompiler = { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}
    val hiltNavigationCompose = { "androidx.hilt:hilt-navigation-compose:${Versions.navigationCompose}"}
}

object Modules{
    const val utilities = ":utilities"
}