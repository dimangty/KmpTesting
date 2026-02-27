package com.example.kursovikkmp.resources

import kursovikkmp.shared.core.generated.resources.Res
import kursovikkmp.shared.core.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

object AppResources {
    object strings {
        val scr_news_tab_title: StringResource = Res.string.scr_news_tab_title
        val scr_favorite_tab_title: StringResource = Res.string.scr_favorite_tab_title
        val scr_recipes_tab_title: StringResource = Res.string.scr_recipes_tab_title
        val scr_fridge_tab_title: StringResource = Res.string.scr_fridge_tab_title
        val scr_profile_tab_title: StringResource = Res.string.scr_profile_tab_title
        val scr_news_screen_title: StringResource = Res.string.scr_news_screen_title
        val scr_news_search_placeholder: StringResource = Res.string.scr_news_search_placeholder
        val scr_favorite_screen_title: StringResource = Res.string.scr_favorite_screen_title
        val scr_recipes_screen_title: StringResource = Res.string.scr_recipes_screen_title
        val scr_fridge_screen_title: StringResource = Res.string.scr_fridge_screen_title
        val scr_fridge_products_title: StringResource = Res.string.scr_fridge_products_title
        val scr_fridge_recommendations_title: StringResource = Res.string.scr_fridge_recommendations_title
        val scr_fridge_empty_recommendations: StringResource = Res.string.scr_fridge_empty_recommendations
        val scr_fridge_recommend_button: StringResource = Res.string.scr_fridge_recommend_button
        val scr_recipe_details_screen_title: StringResource = Res.string.scr_recipe_details_screen_title
        val scr_recipe_ingredients_title: StringResource = Res.string.scr_recipe_ingredients_title
        val scr_recipe_steps_title: StringResource = Res.string.scr_recipe_steps_title

        val phone_number: StringResource = Res.string.phone_number
        val confirm: StringResource = Res.string.confirm
        val sign_up: StringResource = Res.string.sign_up
        val pin_placeholder: StringResource = Res.string.pin_placeholder
        val confirm_pin: StringResource = Res.string.confirm_pin
        val pin_helper_text: StringResource = Res.string.pin_helper_text
        val invalid_pin: StringResource = Res.string.invalid_pin
        val sign_up_title: StringResource = Res.string.sign_up_title
        val first_name: StringResource = Res.string.first_name
        val last_name: StringResource = Res.string.last_name
        val gender: StringResource = Res.string.gender
        val birth_date: StringResource = Res.string.birth_date
        val country: StringResource = Res.string.country
        val city: StringResource = Res.string.city
        val email: StringResource = Res.string.email
        val phone: StringResource = Res.string.phone
        val create_account: StringResource = Res.string.create_account
        val sign_up_failed: StringResource = Res.string.sign_up_failed
    }

    object drawable {
        val favorite_on_icon: DrawableResource = Res.drawable.favorite_on_icon
        val favorite_off_icon: DrawableResource = Res.drawable.favorite_off_icon
        val ic_titlebar_back: DrawableResource = Res.drawable.ic_titlebar_back
    }
}
