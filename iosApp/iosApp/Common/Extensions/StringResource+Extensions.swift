//
//  StringResource+Extensions.swift
//  iosApp
//
//  Extension for moko-resources StringResource
//

import SwiftUI
import ComposeApp

extension StringResource {
    func localized() -> String {
        return self.desc().localized()
    }
}
