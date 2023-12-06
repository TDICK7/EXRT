import SwiftUI
import shared

@main
struct iOSApp: App {

    init() {
        KoinInit.init()
    }

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
