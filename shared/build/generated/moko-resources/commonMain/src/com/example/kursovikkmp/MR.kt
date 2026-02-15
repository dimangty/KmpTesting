package com.example.kursovikkmp

import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.ResourcePlatformDetails
import dev.icerock.moko.resources.StringResource
import kotlin.collections.List

public expect object MR {
  public object strings : ResourceContainer<StringResource> {
    override val __platformDetails: ResourcePlatformDetails

    public val scr_news_tab_title: StringResource

    public val scr_favorite_tab_title: StringResource

    public val scr_recipes_tab_title: StringResource

    public val scr_fridge_tab_title: StringResource

    public val scr_profile_tab_title: StringResource

    public val scr_news_screen_title: StringResource

    public val scr_news_search_placeholder: StringResource

    public val scr_favorite_screen_title: StringResource

    public val scr_recipes_screen_title: StringResource

    public val scr_fridge_screen_title: StringResource

    public val scr_fridge_products_title: StringResource

    public val scr_fridge_search_placeholder: StringResource

    public val scr_fridge_recommendations_title: StringResource

    public val scr_fridge_empty_recommendations: StringResource

    public val scr_fridge_recommend_button: StringResource

    public val scr_recipe_details_screen_title: StringResource

    public val scr_recipe_ingredients_title: StringResource

    public val scr_recipe_steps_title: StringResource

    public val scr_details_open_button: StringResource

    public val phone_number: StringResource

    public val confirm: StringResource

    public val sign_up: StringResource

    public val invalid_phone_number: StringResource

    public val pin_placeholder: StringResource

    public val confirm_pin: StringResource

    public val pin_helper_text: StringResource

    public val invalid_pin: StringResource

    public val sign_up_title: StringResource

    public val personal_information: StringResource

    public val first_name: StringResource

    public val last_name: StringResource

    public val gender: StringResource

    public val select: StringResource

    public val birth_date: StringResource

    public val location: StringResource

    public val country: StringResource

    public val city: StringResource

    public val contact: StringResource

    public val email: StringResource

    public val phone: StringResource

    public val create_account: StringResource

    public val back: StringResource

    public val sign_up_failed: StringResource

    public val male: StringResource

    public val female: StringResource

    public val other: StringResource

    public val usa: StringResource

    public val uk: StringResource

    public val germany: StringResource

    public val france: StringResource

    public val new_york: StringResource

    public val london: StringResource

    public val berlin: StringResource

    public val paris: StringResource

    public val news: StringResource

    public val favorites: StringResource

    public val profile: StringResource

    public val loading: StringResource

    public val error: StringResource

    public val retry: StringResource

    override fun values(): List<StringResource>
  }

  public object images : ResourceContainer<ImageResource> {
    override val __platformDetails: ResourcePlatformDetails

    public val favorite_on_icon: ImageResource

    public val ic_titlebar_back: ImageResource

    public val favorite_off_icon: ImageResource

    override fun values(): List<ImageResource>
  }

  public object colors : ResourceContainer<ColorResource> {
    override val __platformDetails: ResourcePlatformDetails

    public val white: ColorResource

    public val black: ColorResource

    public val primary: ColorResource

    public val loader_screen_background: ColorResource

    public val loader_opaque_screen_background: ColorResource

    public val loader_background: ColorResource

    public val loader_opaque_background: ColorResource

    public val loader: ColorResource

    public val loader_opaque: ColorResource

    public val grey: ColorResource

    public val light_grey: ColorResource

    public val red: ColorResource

    override fun values(): List<ColorResource>
  }

  public object fonts : ResourceContainer<FontResource> {
    override val __platformDetails: ResourcePlatformDetails

    public val lato_semibold: FontResource

    public val lato_regular: FontResource

    public val lato_medium: FontResource

    public val lato_light: FontResource

    override fun values(): List<FontResource>
  }
}
