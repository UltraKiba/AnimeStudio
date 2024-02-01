package ani.dantotsu.settings.saving

import ani.dantotsu.settings.saving.internal.Pref
import ani.dantotsu.settings.saving.internal.Location

enum class PrefName(val data: Pref) {
    //General
    SharedUserID(Pref(Location.General, Boolean::class)),
    OfflineView(Pref(Location.General, Int::class)),
    UseOLED(Pref(Location.General, Boolean::class)),
    UseCustomTheme(Pref(Location.General, Boolean::class)),
    CustomThemeInt(Pref(Location.General, Int::class)),
    UseSourceTheme(Pref(Location.General, Boolean::class)),
    UseMaterialYou(Pref(Location.General, Boolean::class)),
    Theme(Pref(Location.General, String::class)),
    DownloadManager(Pref(Location.General, Int::class)),
    NSFWExtension(Pref(Location.General, Boolean::class)),
    SkipExtensionIcons(Pref(Location.General, Boolean::class)),
    SdDl(Pref(Location.General, Boolean::class)),
    ContinueMedia(Pref(Location.General, Boolean::class)),
    RecentlyListOnly(Pref(Location.General, Boolean::class)),
    SettingsPreferDub(Pref(Location.General, Boolean::class)),
    SubscriptionsTimeS(Pref(Location.General, Int::class)),
    SubscriptionCheckingNotifications(Pref(Location.General, Boolean::class)),
    CheckUpdate(Pref(Location.General, Boolean::class)),

    //Anime
    AnimeListSortOrder(Pref(Location.Anime, String::class)),
    PinnedAnimeSources(Pref(Location.Anime, Set::class)),
    PopularAnimeList(Pref(Location.Anime, Boolean::class)),
    AnimeSearchHistory(Pref(Location.Anime, Set::class)),

    //Manga
    MangaListSortOrder(Pref(Location.Manga, String::class)),
    PinnedMangaSources(Pref(Location.Manga, Set::class)),
    PopularMangaList(Pref(Location.Manga, Boolean::class)),
    MangaSearchHistory(Pref(Location.Manga, Set::class)),

    //Irrelevant
    Incognito(Pref(Location.Irrelevant, Boolean::class)),
    OfflineMode(Pref(Location.Irrelevant, Boolean::class)),
    DownloadsKeys(Pref(Location.Irrelevant, String::class)),
    NovelLastExtCheck(Pref(Location.Irrelevant, Long::class)),
    SomethingSpecial(Pref(Location.Irrelevant, Boolean::class)),
    AllowOpeningLinks(Pref(Location.Irrelevant, Boolean::class)),
    SearchStyle(Pref(Location.Irrelevant, Int::class)),
    HasUpdatedPrefs(Pref(Location.Irrelevant, Boolean::class)),
    LangSort(Pref(Location.Irrelevant, String::class)),

    //Protected
    DiscordToken(Pref(Location.Protected, String::class)),
    DiscordId(Pref(Location.Protected, String::class)),
    DiscordUserName(Pref(Location.Protected, String::class)),
    DiscordAvatar(Pref(Location.Protected, String::class)),
    AnilistUserName(Pref(Location.Protected, String::class)),
}