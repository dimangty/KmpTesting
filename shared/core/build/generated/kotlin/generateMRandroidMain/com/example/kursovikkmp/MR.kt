package com.example.kursovikkmp

import com.example.kursovikkmp.core.R
import dev.icerock.moko.resources.ColorResource
import dev.icerock.moko.resources.FontResource
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.ResourceContainer
import dev.icerock.moko.resources.ResourcePlatformDetails
import dev.icerock.moko.resources.StringResource
import kotlin.String
import kotlin.collections.List

public actual object MR {
  private val contentHash: String = "4a0374464ca3fa98d19fce1f99e782a6"

  public actual object strings : ResourceContainer<StringResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails()

    public actual val scr_news_tab_title: StringResource =
        StringResource(R.string.scr_news_tab_title)

    public actual val scr_favorite_tab_title: StringResource =
        StringResource(R.string.scr_favorite_tab_title)

    public actual val scr_recipes_tab_title: StringResource =
        StringResource(R.string.scr_recipes_tab_title)

    public actual val scr_fridge_tab_title: StringResource =
        StringResource(R.string.scr_fridge_tab_title)

    public actual val scr_profile_tab_title: StringResource =
        StringResource(R.string.scr_profile_tab_title)

    public actual val scr_news_screen_title: StringResource =
        StringResource(R.string.scr_news_screen_title)

    public actual val scr_news_search_placeholder: StringResource =
        StringResource(R.string.scr_news_search_placeholder)

    public actual val scr_favorite_screen_title: StringResource =
        StringResource(R.string.scr_favorite_screen_title)

    public actual val scr_recipes_screen_title: StringResource =
        StringResource(R.string.scr_recipes_screen_title)

    public actual val scr_fridge_screen_title: StringResource =
        StringResource(R.string.scr_fridge_screen_title)

    public actual val scr_fridge_products_title: StringResource =
        StringResource(R.string.scr_fridge_products_title)

    public actual val scr_fridge_recommendations_title: StringResource =
        StringResource(R.string.scr_fridge_recommendations_title)

    public actual val scr_fridge_empty_recommendations: StringResource =
        StringResource(R.string.scr_fridge_empty_recommendations)

    public actual val scr_fridge_recommend_button: StringResource =
        StringResource(R.string.scr_fridge_recommend_button)

    public actual val scr_recipe_details_screen_title: StringResource =
        StringResource(R.string.scr_recipe_details_screen_title)

    public actual val scr_recipe_ingredients_title: StringResource =
        StringResource(R.string.scr_recipe_ingredients_title)

    public actual val scr_recipe_steps_title: StringResource =
        StringResource(R.string.scr_recipe_steps_title)

    public actual val scr_details_open_button: StringResource =
        StringResource(R.string.scr_details_open_button)

    public actual val phone_number: StringResource = StringResource(R.string.phone_number)

    public actual val confirm: StringResource = StringResource(R.string.confirm)

    public actual val sign_up: StringResource = StringResource(R.string.sign_up)

    public actual val invalid_phone_number: StringResource =
        StringResource(R.string.invalid_phone_number)

    public actual val pin_placeholder: StringResource = StringResource(R.string.pin_placeholder)

    public actual val confirm_pin: StringResource = StringResource(R.string.confirm_pin)

    public actual val pin_helper_text: StringResource = StringResource(R.string.pin_helper_text)

    public actual val invalid_pin: StringResource = StringResource(R.string.invalid_pin)

    public actual val sign_up_title: StringResource = StringResource(R.string.sign_up_title)

    public actual val personal_information: StringResource =
        StringResource(R.string.personal_information)

    public actual val first_name: StringResource = StringResource(R.string.first_name)

    public actual val last_name: StringResource = StringResource(R.string.last_name)

    public actual val gender: StringResource = StringResource(R.string.gender)

    public actual val select: StringResource = StringResource(R.string.select)

    public actual val birth_date: StringResource = StringResource(R.string.birth_date)

    public actual val location: StringResource = StringResource(R.string.location)

    public actual val country: StringResource = StringResource(R.string.country)

    public actual val city: StringResource = StringResource(R.string.city)

    public actual val contact: StringResource = StringResource(R.string.contact)

    public actual val email: StringResource = StringResource(R.string.email)

    public actual val phone: StringResource = StringResource(R.string.phone)

    public actual val create_account: StringResource = StringResource(R.string.create_account)

    public actual val back: StringResource = StringResource(R.string.back)

    public actual val sign_up_failed: StringResource = StringResource(R.string.sign_up_failed)

    public actual val male: StringResource = StringResource(R.string.male)

    public actual val female: StringResource = StringResource(R.string.female)

    public actual val other: StringResource = StringResource(R.string.other)

    public actual val usa: StringResource = StringResource(R.string.usa)

    public actual val uk: StringResource = StringResource(R.string.uk)

    public actual val germany: StringResource = StringResource(R.string.germany)

    public actual val france: StringResource = StringResource(R.string.france)

    public actual val new_york: StringResource = StringResource(R.string.new_york)

    public actual val london: StringResource = StringResource(R.string.london)

    public actual val berlin: StringResource = StringResource(R.string.berlin)

    public actual val paris: StringResource = StringResource(R.string.paris)

    public actual val news: StringResource = StringResource(R.string.news)

    public actual val favorites: StringResource = StringResource(R.string.favorites)

    public actual val profile: StringResource = StringResource(R.string.profile)

    public actual val loading: StringResource = StringResource(R.string.loading)

    public actual val error: StringResource = StringResource(R.string.error)

    public actual val retry: StringResource = StringResource(R.string.retry)

    actual override fun values(): List<StringResource> = listOf(scr_news_tab_title,
        scr_favorite_tab_title, scr_recipes_tab_title, scr_fridge_tab_title, scr_profile_tab_title,
        scr_news_screen_title, scr_news_search_placeholder, scr_favorite_screen_title,
        scr_recipes_screen_title, scr_fridge_screen_title, scr_fridge_products_title,
        scr_fridge_recommendations_title, scr_fridge_empty_recommendations,
        scr_fridge_recommend_button, scr_recipe_details_screen_title, scr_recipe_ingredients_title,
        scr_recipe_steps_title, scr_details_open_button, phone_number, confirm, sign_up,
        invalid_phone_number, pin_placeholder, confirm_pin, pin_helper_text, invalid_pin,
        sign_up_title, personal_information, first_name, last_name, gender, select, birth_date,
        location, country, city, contact, email, phone, create_account, back, sign_up_failed, male,
        female, other, usa, uk, germany, france, new_york, london, berlin, paris, news, favorites,
        profile, loading, error, retry)
  }

  public actual object images : ResourceContainer<ImageResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails()

    public actual val favorite_on_icon: ImageResource = ImageResource(R.drawable.favorite_on_icon)

    public actual val ic_titlebar_back: ImageResource = ImageResource(R.drawable.ic_titlebar_back)

    public actual val favorite_off_icon: ImageResource = ImageResource(R.drawable.favorite_off_icon)

    actual override fun values(): List<ImageResource> = listOf(favorite_on_icon, ic_titlebar_back,
        favorite_off_icon)
  }

  public actual object colors : ResourceContainer<ColorResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails()

    public actual val white: ColorResource = ColorResource(R.color.white)

    public actual val black: ColorResource = ColorResource(R.color.black)

    public actual val primary: ColorResource = ColorResource(R.color.primary)

    public actual val loader_screen_background: ColorResource =
        ColorResource(R.color.loader_screen_background)

    public actual val loader_opaque_screen_background: ColorResource =
        ColorResource(R.color.loader_opaque_screen_background)

    public actual val loader_background: ColorResource = ColorResource(R.color.loader_background)

    public actual val loader_opaque_background: ColorResource =
        ColorResource(R.color.loader_opaque_background)

    public actual val loader: ColorResource = ColorResource(R.color.loader)

    public actual val loader_opaque: ColorResource = ColorResource(R.color.loader_opaque)

    public actual val grey: ColorResource = ColorResource(R.color.grey)

    public actual val light_grey: ColorResource = ColorResource(R.color.light_grey)

    public actual val red: ColorResource = ColorResource(R.color.red)

    actual override fun values(): List<ColorResource> = listOf(white, black, primary,
        loader_screen_background, loader_opaque_screen_background, loader_background,
        loader_opaque_background, loader, loader_opaque, grey, light_grey, red)
  }

  public actual object fonts : ResourceContainer<FontResource> {
    actual override val __platformDetails: ResourcePlatformDetails = ResourcePlatformDetails()

    public actual val lato_semibold: FontResource = FontResource(R.font.lato_semibold)

    public actual val lato_regular: FontResource = FontResource(R.font.lato_regular)

    public actual val lato_medium: FontResource = FontResource(R.font.lato_medium)

    public actual val lato_light: FontResource = FontResource(R.font.lato_light)

    actual override fun values(): List<FontResource> = listOf(lato_semibold, lato_regular,
        lato_medium, lato_light)
  }
}
