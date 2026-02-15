package com.example.kursovikkmp

import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.ResourcePlatformDetails
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.utils.loadableBundle
import kotlin.String
import kotlin.collections.List
import platform.Foundation.NSBundle

public actual object MR {
  private val contentHash: String = "0e2ad849932a053c2746c03d5ac52c8a"

  private val bundle: NSBundle by lazy { NSBundle.loadableBundle("com.example.kursovikkmp.main") }

  public actual object strings : ResourceContainer<StringResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails(bundle)

    public actual val scr_news_tab_title: StringResource = StringResource(resourceId =
        "scr_news_tab_title", bundle = __platformDetails.nsBundle)

    public actual val scr_favorite_tab_title: StringResource = StringResource(resourceId =
        "scr_favorite_tab_title", bundle = __platformDetails.nsBundle)

    public actual val scr_recipes_tab_title: StringResource = StringResource(resourceId =
        "scr_recipes_tab_title", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_tab_title: StringResource = StringResource(resourceId =
        "scr_fridge_tab_title", bundle = __platformDetails.nsBundle)

    public actual val scr_profile_tab_title: StringResource = StringResource(resourceId =
        "scr_profile_tab_title", bundle = __platformDetails.nsBundle)

    public actual val scr_news_screen_title: StringResource = StringResource(resourceId =
        "scr_news_screen_title", bundle = __platformDetails.nsBundle)

    public actual val scr_news_search_placeholder: StringResource = StringResource(resourceId =
        "scr_news_search_placeholder", bundle = __platformDetails.nsBundle)

    public actual val scr_favorite_screen_title: StringResource = StringResource(resourceId =
        "scr_favorite_screen_title", bundle = __platformDetails.nsBundle)

    public actual val scr_recipes_screen_title: StringResource = StringResource(resourceId =
        "scr_recipes_screen_title", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_screen_title: StringResource = StringResource(resourceId =
        "scr_fridge_screen_title", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_products_title: StringResource = StringResource(resourceId =
        "scr_fridge_products_title", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_search_placeholder: StringResource = StringResource(resourceId =
        "scr_fridge_search_placeholder", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_recommendations_title: StringResource = StringResource(resourceId =
        "scr_fridge_recommendations_title", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_empty_recommendations: StringResource = StringResource(resourceId =
        "scr_fridge_empty_recommendations", bundle = __platformDetails.nsBundle)

    public actual val scr_fridge_recommend_button: StringResource = StringResource(resourceId =
        "scr_fridge_recommend_button", bundle = __platformDetails.nsBundle)

    public actual val scr_recipe_details_screen_title: StringResource = StringResource(resourceId =
        "scr_recipe_details_screen_title", bundle = __platformDetails.nsBundle)

    public actual val scr_recipe_ingredients_title: StringResource = StringResource(resourceId =
        "scr_recipe_ingredients_title", bundle = __platformDetails.nsBundle)

    public actual val scr_recipe_steps_title: StringResource = StringResource(resourceId =
        "scr_recipe_steps_title", bundle = __platformDetails.nsBundle)

    public actual val scr_details_open_button: StringResource = StringResource(resourceId =
        "scr_details_open_button", bundle = __platformDetails.nsBundle)

    public actual val phone_number: StringResource = StringResource(resourceId = "phone_number",
        bundle = __platformDetails.nsBundle)

    public actual val confirm: StringResource = StringResource(resourceId = "confirm", bundle =
        __platformDetails.nsBundle)

    public actual val sign_up: StringResource = StringResource(resourceId = "sign_up", bundle =
        __platformDetails.nsBundle)

    public actual val invalid_phone_number: StringResource = StringResource(resourceId =
        "invalid_phone_number", bundle = __platformDetails.nsBundle)

    public actual val pin_placeholder: StringResource = StringResource(resourceId =
        "pin_placeholder", bundle = __platformDetails.nsBundle)

    public actual val confirm_pin: StringResource = StringResource(resourceId = "confirm_pin",
        bundle = __platformDetails.nsBundle)

    public actual val pin_helper_text: StringResource = StringResource(resourceId =
        "pin_helper_text", bundle = __platformDetails.nsBundle)

    public actual val invalid_pin: StringResource = StringResource(resourceId = "invalid_pin",
        bundle = __platformDetails.nsBundle)

    public actual val sign_up_title: StringResource = StringResource(resourceId = "sign_up_title",
        bundle = __platformDetails.nsBundle)

    public actual val personal_information: StringResource = StringResource(resourceId =
        "personal_information", bundle = __platformDetails.nsBundle)

    public actual val first_name: StringResource = StringResource(resourceId = "first_name", bundle
        = __platformDetails.nsBundle)

    public actual val last_name: StringResource = StringResource(resourceId = "last_name", bundle =
        __platformDetails.nsBundle)

    public actual val gender: StringResource = StringResource(resourceId = "gender", bundle =
        __platformDetails.nsBundle)

    public actual val select: StringResource = StringResource(resourceId = "select", bundle =
        __platformDetails.nsBundle)

    public actual val birth_date: StringResource = StringResource(resourceId = "birth_date", bundle
        = __platformDetails.nsBundle)

    public actual val location: StringResource = StringResource(resourceId = "location", bundle =
        __platformDetails.nsBundle)

    public actual val country: StringResource = StringResource(resourceId = "country", bundle =
        __platformDetails.nsBundle)

    public actual val city: StringResource = StringResource(resourceId = "city", bundle =
        __platformDetails.nsBundle)

    public actual val contact: StringResource = StringResource(resourceId = "contact", bundle =
        __platformDetails.nsBundle)

    public actual val email: StringResource = StringResource(resourceId = "email", bundle =
        __platformDetails.nsBundle)

    public actual val phone: StringResource = StringResource(resourceId = "phone", bundle =
        __platformDetails.nsBundle)

    public actual val create_account: StringResource = StringResource(resourceId = "create_account",
        bundle = __platformDetails.nsBundle)

    public actual val back: StringResource = StringResource(resourceId = "back", bundle =
        __platformDetails.nsBundle)

    public actual val sign_up_failed: StringResource = StringResource(resourceId = "sign_up_failed",
        bundle = __platformDetails.nsBundle)

    public actual val male: StringResource = StringResource(resourceId = "male", bundle =
        __platformDetails.nsBundle)

    public actual val female: StringResource = StringResource(resourceId = "female", bundle =
        __platformDetails.nsBundle)

    public actual val other: StringResource = StringResource(resourceId = "other", bundle =
        __platformDetails.nsBundle)

    public actual val usa: StringResource = StringResource(resourceId = "usa", bundle =
        __platformDetails.nsBundle)

    public actual val uk: StringResource = StringResource(resourceId = "uk", bundle =
        __platformDetails.nsBundle)

    public actual val germany: StringResource = StringResource(resourceId = "germany", bundle =
        __platformDetails.nsBundle)

    public actual val france: StringResource = StringResource(resourceId = "france", bundle =
        __platformDetails.nsBundle)

    public actual val new_york: StringResource = StringResource(resourceId = "new_york", bundle =
        __platformDetails.nsBundle)

    public actual val london: StringResource = StringResource(resourceId = "london", bundle =
        __platformDetails.nsBundle)

    public actual val berlin: StringResource = StringResource(resourceId = "berlin", bundle =
        __platformDetails.nsBundle)

    public actual val paris: StringResource = StringResource(resourceId = "paris", bundle =
        __platformDetails.nsBundle)

    public actual val news: StringResource = StringResource(resourceId = "news", bundle =
        __platformDetails.nsBundle)

    public actual val favorites: StringResource = StringResource(resourceId = "favorites", bundle =
        __platformDetails.nsBundle)

    public actual val profile: StringResource = StringResource(resourceId = "profile", bundle =
        __platformDetails.nsBundle)

    public actual val loading: StringResource = StringResource(resourceId = "loading", bundle =
        __platformDetails.nsBundle)

    public actual val error: StringResource = StringResource(resourceId = "error", bundle =
        __platformDetails.nsBundle)

    public actual val retry: StringResource = StringResource(resourceId = "retry", bundle =
        __platformDetails.nsBundle)

    actual override fun values(): List<StringResource> = listOf(scr_news_tab_title,
        scr_favorite_tab_title, scr_recipes_tab_title, scr_fridge_tab_title, scr_profile_tab_title,
        scr_news_screen_title, scr_news_search_placeholder, scr_favorite_screen_title,
        scr_recipes_screen_title, scr_fridge_screen_title, scr_fridge_products_title,
        scr_fridge_search_placeholder, scr_fridge_recommendations_title,
        scr_fridge_empty_recommendations, scr_fridge_recommend_button,
        scr_recipe_details_screen_title, scr_recipe_ingredients_title, scr_recipe_steps_title,
        scr_details_open_button, phone_number, confirm, sign_up, invalid_phone_number,
        pin_placeholder, confirm_pin, pin_helper_text, invalid_pin, sign_up_title,
        personal_information, first_name, last_name, gender, select, birth_date, location, country,
        city, contact, email, phone, create_account, back, sign_up_failed, male, female, other, usa,
        uk, germany, france, new_york, london, berlin, paris, news, favorites, profile, loading,
        error, retry)
  }

  public actual object images : ResourceContainer<ImageResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails(bundle)

    public actual val favorite_on_icon: ImageResource = ImageResource(assetImageName =
        "favorite_on_icon", bundle = __platformDetails.nsBundle)

    public actual val ic_titlebar_back: ImageResource = ImageResource(assetImageName =
        "ic_titlebar_back", bundle = __platformDetails.nsBundle)

    public actual val favorite_off_icon: ImageResource = ImageResource(assetImageName =
        "favorite_off_icon", bundle = __platformDetails.nsBundle)

    actual override fun values(): List<ImageResource> = listOf(favorite_on_icon, ic_titlebar_back,
        favorite_off_icon)
  }

  public actual object colors : ResourceContainer<ColorResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails(bundle)

    public actual val white: ColorResource = ColorResource(name = "white", bundle =
        __platformDetails.nsBundle)

    public actual val black: ColorResource = ColorResource(name = "black", bundle =
        __platformDetails.nsBundle)

    public actual val primary: ColorResource = ColorResource(name = "primary", bundle =
        __platformDetails.nsBundle)

    public actual val loader_screen_background: ColorResource = ColorResource(name =
        "loader_screen_background", bundle = __platformDetails.nsBundle)

    public actual val loader_opaque_screen_background: ColorResource = ColorResource(name =
        "loader_opaque_screen_background", bundle = __platformDetails.nsBundle)

    public actual val loader_background: ColorResource = ColorResource(name = "loader_background",
        bundle = __platformDetails.nsBundle)

    public actual val loader_opaque_background: ColorResource = ColorResource(name =
        "loader_opaque_background", bundle = __platformDetails.nsBundle)

    public actual val loader: ColorResource = ColorResource(name = "loader", bundle =
        __platformDetails.nsBundle)

    public actual val loader_opaque: ColorResource = ColorResource(name = "loader_opaque", bundle =
        __platformDetails.nsBundle)

    public actual val grey: ColorResource = ColorResource(name = "grey", bundle =
        __platformDetails.nsBundle)

    public actual val light_grey: ColorResource = ColorResource(name = "light_grey", bundle =
        __platformDetails.nsBundle)

    public actual val red: ColorResource = ColorResource(name = "red", bundle =
        __platformDetails.nsBundle)

    actual override fun values(): List<ColorResource> = listOf(white, black, primary,
        loader_screen_background, loader_opaque_screen_background, loader_background,
        loader_opaque_background, loader, loader_opaque, grey, light_grey, red)
  }

  public actual object fonts : ResourceContainer<FontResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails(bundle)

    public actual val lato_semibold: FontResource = FontResource(fontName = "lato_semibold.ttf",
        bundle = __platformDetails.nsBundle)

    public actual val lato_regular: FontResource = FontResource(fontName = "lato_regular.ttf",
        bundle = __platformDetails.nsBundle)

    public actual val lato_medium: FontResource = FontResource(fontName = "lato_medium.ttf", bundle
        = __platformDetails.nsBundle)

    public actual val lato_light: FontResource = FontResource(fontName = "lato_light.ttf", bundle =
        __platformDetails.nsBundle)

    actual override fun values(): List<FontResource> = listOf(lato_semibold, lato_regular,
        lato_medium, lato_light)
  }
}
