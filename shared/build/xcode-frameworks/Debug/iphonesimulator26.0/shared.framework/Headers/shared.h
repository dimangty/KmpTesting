#import <Foundation/NSArray.h>
#import <Foundation/NSDictionary.h>
#import <Foundation/NSError.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSSet.h>
#import <Foundation/NSString.h>
#import <Foundation/NSValue.h>

@class SharedArticleDb, SharedArticle, SharedProfileDb, SharedProfileData, SharedNetworkModule, SharedKoin_coreModule, SharedStorageModule, SharedArticleDbQueries, SharedProfileDbQueries, SharedDatabaseCompanion, SharedMR, SharedResourcePlatformDetails, SharedMRColors, SharedColorResource, SharedMRFonts, SharedFontResource, SharedMRImages, SharedImageResource, SharedMRStrings, SharedStringResource, SharedKotlinArray<T>, SharedLifecycle_viewmodelViewModel, SharedNavigationAction, SharedDefaultUiEvent, SharedErrorStateAlertError, SharedCommonFlow<T>, SharedLceState, SharedLceStateManager, SharedTitleBarState, SharedDefaultUiEventOnBackClicked, SharedDefaultUiEventOnScreenCreated, SharedDefaultUiEventOnScreenDestroyed, SharedDefaultUiEventOnScreenResumed, SharedErrorState, SharedErrorStateAlertErrorCompanion, SharedTextState, SharedErrorStateApiAlertErrorCompanion, SharedErrorStateApiAlertError, SharedButtonData, SharedKotlinEnumCompanion, SharedKotlinEnum<E>, SharedButtonDataAlignment, SharedButtonDataColoredState, SharedButtonDataImageButtonCompanion, SharedButtonDataImageButton, SharedButtonDataPrimaryButtonCompanion, SharedButtonDataPrimaryButton, SharedButtonStateCompanion, SharedButtonState, SharedDropdownFieldState, SharedTextFieldStateKeyboardType, SharedTextFieldState, SharedTextFontStateCompanion, SharedTextFontState, SharedTextStateCompanion, SharedTitleBarStateCompanion, SharedKotlinUnit, SharedRuntimeTransacterTransaction, SharedKotlinThrowable, SharedRuntimeBaseTransacterImpl, SharedRuntimeSuspendingTransacterImpl, SharedRuntimeQuery<__covariant RowType>, SharedKotlinException, SharedAuthError, SharedAuthErrorInvalidData, SharedAuthErrorInvalidPhone, SharedSignUpData, SharedLoginEvents, SharedLoginEventsLoginButtonTapped, SharedLoginEventsPhoneChanged, SharedLoginEventsSignUpButtonTapped, SharedLoginState, SharedBaseViewModel<State, Event>, SharedPinEvents, SharedPinEventsConfirmTapped, SharedPinEventsPinChanged, SharedPinState, SharedSignUpEvents, SharedSignUpEventsBackButtonTapped, SharedSignUpEventsBirthDateChanged, SharedSignUpEventsCityChanged, SharedSignUpEventsCountryChanged, SharedSignUpEventsCreateAccountTapped, SharedSignUpEventsEmailChanged, SharedSignUpEventsFirstNameChanged, SharedSignUpEventsGenderChanged, SharedSignUpEventsLastNameChanged, SharedSignUpEventsPhoneChanged, SharedSignUpState, SharedFavoriteDetailsEvents, SharedFavoriteDetailsEventsOnOpenClicked, SharedFavoriteDetailsStateCompanion, SharedFavoriteDetailsState, SharedFavoriteUiStateCompanion, SharedFavoriteUiState, SharedFavoritesListEvents, SharedFavoritesListStateCompanion, SharedFavoritesListState, SharedArticleDao, SharedFridgeProduct, SharedFridgeRecommendedRecipe, SharedFridgeEvents, SharedFridgeEventsOnProductClicked, SharedFridgeEventsOnRecipeClicked, SharedFridgeEventsOnRecommendRecipesClicked, SharedFridgeEventsOnRetryClicked, SharedFridgeProductUiState, SharedFridgeRecommendedRecipeUiStateCompanion, SharedFridgeRecommendedRecipeUiState, SharedFridgeStateCompanion, SharedFridgeState, SharedHomeStateCompanion, SharedHomeState, SharedHomeEvents, SharedKtor_client_coreHttpResponse, SharedKtor_client_coreHttpClient, SharedNetworkSettings, SharedNewsDetailsEvents, SharedNewsDetailsEventsOnFavoriteClicked, SharedNewsDetailsEventsOnOpenClicked, SharedNewsDetailsStateCompanion, SharedNewsDetailsState, SharedNewsListEvents, SharedNewsUiState, SharedNewsListStateCompanion, SharedNewsListState, SharedNewsUiStateCompanion, SharedArticleCompanion, SharedNewsListCompanion, SharedNewsList, SharedProfileDataCompanion, SharedProfileEffect, SharedProfileEffectShowImageSourceDialog, SharedProfileEvents, SharedProfileEventsAvatarTapped, SharedProfileEventsLogoutTapped, SharedProfileEventsPhotoChanged, SharedProfileDao, SharedProfileState, SharedRecipe, SharedRecipeIngredientUiState, SharedRecipeStepUiState, SharedRecipesDetailsEvents, SharedRecipesDetailsEventsOnRetryClicked, SharedRecipesDetailsStateCompanion, SharedRecipesDetailsState, SharedRecipeUiStateCompanion, SharedRecipeUiState, SharedRecipesListEvents, SharedRecipesListEventsOnRetryClicked, SharedRecipesListStateCompanion, SharedRecipesListState, SharedRecipeIngredient, SharedRecipeStep, SharedNavigationActionCompanion, SharedNavigationActionNavigateBack, SharedNavigationActionNavigateToFavoritesDetailsCompanion, SharedNavigationActionNavigateToLogin, SharedNavigationActionNavigateToMain, SharedNavigationActionNavigateToNewsDetailsCompanion, SharedNavigationActionNavigateToPin, SharedNavigationActionNavigateToRecipesDetailsCompanion, SharedNavigationActionNavigateToSignUp, SharedDateSerializer, SharedKotlinx_datetimeLocalDate, SharedDateTimeSerializer, SharedKotlinx_datetimeLocalDateTime, SharedColorCompanion, SharedColor, NSBundle, NSURL, SharedFileResource, NSData, UIImage, NSError, SharedCompositionStringDesc, SharedPluralsResource, SharedPluralFormattedStringDesc, SharedPluralStringDesc, SharedRawStringDesc, SharedResourceFormattedStringDesc, SharedResourceStringDesc, SharedStringDescCompanion, SharedStringDescLocaleType, NSLocale, SharedStringDescLocaleTypeSystem, SharedUtils, SharedColorDescCompanion, SharedImageDescCompanion, SharedImageDescResource, SharedImageDescUrl, SharedApiErrorCompanion, SharedApiError, SharedApiErrorWrapperCompanion, SharedApiErrorWrapper, UIFont, UIColor, SharedKotlinx_datetimeLocalDateCompanion, SharedKotlinx_datetimeLocalDateTimeCompanion, SharedKoin_coreScope, SharedKoin_coreParametersHolder, SharedKotlinLazyThreadSafetyMode, SharedKoin_coreLogger, SharedKoin_coreExtensionManager, SharedKoin_coreInstanceRegistry, SharedKoin_corePropertyRegistry, SharedKoin_coreScopeRegistry, SharedKoin_coreKoin, Protocol, SharedKoin_coreKoinApplication, SharedAssetResource, SharedKotlinRuntimeException, SharedKotlinIllegalStateException, SharedKoin_coreKoinDefinition<R>, SharedKoin_coreInstanceFactory<T>, SharedKoin_coreSingleInstanceFactory<T>, SharedKoin_coreScopeDSL, SharedRuntimeAfterVersion, SharedRuntimeExecutableQuery<__covariant RowType>, SharedKtor_client_coreHttpClientCall, SharedKtor_utilsGMTDate, SharedKtor_httpHttpStatusCode, SharedKtor_httpHttpProtocolVersion, SharedKtor_client_coreHttpClientEngineConfig, SharedKtor_client_coreHttpClientConfig<T>, SharedKtor_eventsEvents, SharedKtor_client_coreHttpReceivePipeline, SharedKtor_client_coreHttpRequestPipeline, SharedKtor_client_coreHttpResponsePipeline, SharedKtor_client_coreHttpSendPipeline, SharedKotlinx_serialization_coreSerializersModule, SharedKotlinx_serialization_coreSerialKind, SharedKotlinNothing, SharedKotlinx_datetimeMonth, SharedKotlinx_datetimeDayOfWeek, SharedKotlinx_datetimeLocalTime, SharedKoin_coreLockable, SharedKoin_coreLevel, SharedKoin_coreScopeRegistryCompanion, SharedKoin_coreKoinApplicationCompanion, SharedKotlinByteArray, SharedKoin_coreBeanDefinition<T>, SharedKoin_coreInstanceFactoryCompanion, SharedKoin_coreResolutionContext, SharedKtor_client_coreHttpRequestData, SharedKtor_client_coreHttpResponseData, SharedKtor_client_coreHttpClientCallCompanion, SharedKtor_utilsTypeInfo, SharedKtor_ioMemory, SharedKtor_ioChunkBuffer, SharedKtor_ioBuffer, SharedKtor_ioByteReadPacket, SharedKtor_utilsGMTDateCompanion, SharedKtor_utilsWeekDay, SharedKtor_utilsMonth, SharedKtor_httpHttpStatusCodeCompanion, SharedKtor_httpHttpProtocolVersionCompanion, SharedKotlinx_coroutines_coreCoroutineDispatcher, SharedKtor_client_coreProxyConfig, SharedKtor_utilsAttributeKey<T>, SharedKtor_eventsEventDefinition<T>, SharedKtor_utilsPipelinePhase, SharedKtor_utilsPipeline<TSubject, TContext>, SharedKtor_client_coreHttpReceivePipelinePhases, SharedKtor_client_coreHttpRequestPipelinePhases, SharedKtor_client_coreHttpRequestBuilder, SharedKtor_client_coreHttpResponsePipelinePhases, SharedKtor_client_coreHttpResponseContainer, SharedKtor_client_coreHttpSendPipelinePhases, SharedKotlinx_datetimeLocalTimeCompanion, SharedKotlinByteIterator, SharedKoin_coreKind, SharedKoin_coreCallbacks<T>, SharedKtor_httpUrl, SharedKtor_httpHttpMethod, SharedKtor_httpOutgoingContent, SharedKtor_ioMemoryCompanion, SharedKtor_ioBufferCompanion, SharedKtor_ioChunkBufferCompanion, SharedKtor_ioInputCompanion, SharedKtor_ioInput, SharedKtor_ioByteReadPacketCompanion, SharedKtor_utilsWeekDayCompanion, SharedKtor_utilsMonthCompanion, SharedKotlinAbstractCoroutineContextElement, SharedKotlinx_coroutines_coreCoroutineDispatcherKey, SharedKtor_httpHeadersBuilder, SharedKtor_client_coreHttpRequestBuilderCompanion, SharedKtor_httpURLBuilder, SharedKtor_httpUrlCompanion, SharedKtor_httpURLProtocol, SharedKtor_httpHttpMethodCompanion, SharedKtor_httpContentType, SharedKotlinCancellationException, SharedKotlinKTypeProjection, SharedKotlinAbstractCoroutineContextKey<B, E>, SharedKtor_utilsStringValuesBuilderImpl, SharedKtor_httpURLBuilderCompanion, SharedKtor_httpURLProtocolCompanion, SharedKtor_httpHeaderValueParam, SharedKtor_httpHeaderValueWithParametersCompanion, SharedKtor_httpHeaderValueWithParameters, SharedKtor_httpContentTypeCompanion, SharedKotlinKVariance, SharedKotlinKTypeProjectionCompanion;

@protocol SharedDatabase, SharedKotlinCoroutineContext, SharedRuntimeSqlDriver, SharedKotlinSuspendFunction1, SharedRuntimeTransacterBase, SharedRuntimeSuspendingTransacter, SharedRuntimeSqlSchema, SharedPlatform, SharedResourceContainer, SharedKotlinAutoCloseable, SharedKotlinx_coroutines_coreCoroutineScope, SharedDeviceService, SharedKotlinx_coroutines_coreFlow, SharedKotlinx_coroutines_coreStateFlow, SharedKotlinx_coroutines_coreMutableStateFlow, SharedUiEvent, SharedKotlinComparable, SharedAuthService, SharedProfileRepository, SharedValidationService, SharedBaseEvent, SharedBaseViewState, SharedResourceService, SharedFavoritesRepository, SharedFridgeMockNetworkService, SharedRecipesService, SharedNewsService, SharedKotlinx_serialization_coreKSerializer, SharedNavigationService, SharedKotlinx_serialization_coreEncoder, SharedKotlinx_serialization_coreSerialDescriptor, SharedKotlinx_serialization_coreSerializationStrategy, SharedKotlinx_serialization_coreDecoder, SharedKotlinx_serialization_coreDeserializationStrategy, SharedKotlinx_coroutines_coreFlowCollector, SharedKtor_ioCloseable, SharedStringDesc, SharedColorDesc, SharedImageDesc, SharedKoin_coreKoinScopeComponent, SharedKoin_coreQualifier, SharedKotlinKClass, SharedKotlinLazy, SharedKotlinCoroutineContextElement, SharedKotlinCoroutineContextKey, SharedRuntimeQueryListener, SharedRuntimeQueryResult, SharedRuntimeSqlPreparedStatement, SharedRuntimeSqlCursor, SharedRuntimeCloseable, SharedKotlinFunction, SharedKotlinIterator, SharedKotlinx_coroutines_coreSharedFlow, SharedKotlinx_coroutines_coreMutableSharedFlow, SharedRuntimeTransactionCallbacks, SharedKtor_httpHeaders, SharedKtor_httpHttpMessage, SharedKtor_ioByteReadChannel, SharedKtor_client_coreHttpClientEngine, SharedKtor_client_coreHttpClientEngineCapability, SharedKtor_utilsAttributes, SharedKotlinx_serialization_coreCompositeEncoder, SharedKotlinAnnotation, SharedKotlinx_serialization_coreCompositeDecoder, SharedKoin_coreScopeCallback, SharedKoin_coreKoinComponent, SharedKotlinKDeclarationContainer, SharedKotlinKAnnotatedElement, SharedKotlinKClassifier, SharedKoin_coreKoinExtension, SharedKotlinMapEntry, SharedKtor_utilsStringValues, SharedKtor_client_coreHttpRequest, SharedKtor_ioReadSession, SharedKotlinAppendable, SharedKtor_client_coreHttpClientPlugin, SharedKotlinx_coroutines_coreDisposableHandle, SharedKotlinSuspendFunction2, SharedKotlinx_serialization_coreSerializersModuleCollector, SharedKotlinx_coroutines_coreJob, SharedKotlinKType, SharedKtor_ioObjectPool, SharedKotlinContinuation, SharedKotlinContinuationInterceptor, SharedKotlinx_coroutines_coreRunnable, SharedKtor_httpHttpMessageBuilder, SharedKtor_httpParameters, SharedKotlinx_coroutines_coreChildHandle, SharedKotlinx_coroutines_coreChildJob, SharedKotlinSequence, SharedKotlinx_coroutines_coreSelectClause0, SharedKtor_utilsStringValuesBuilder, SharedKtor_httpParametersBuilder, SharedKotlinx_coroutines_coreParentJob, SharedKotlinx_coroutines_coreSelectInstance, SharedKotlinx_coroutines_coreSelectClause;

NS_ASSUME_NONNULL_BEGIN
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wunknown-warning-option"
#pragma clang diagnostic ignored "-Wincompatible-property-type"
#pragma clang diagnostic ignored "-Wnullability"

#pragma push_macro("_Nullable_result")
#if !__has_feature(nullability_nullable_result)
#undef _Nullable_result
#define _Nullable_result _Nullable
#endif

__attribute__((swift_name("KotlinBase")))
@interface SharedBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end

@interface SharedBase (SharedBaseCopying) <NSCopying>
@end

__attribute__((swift_name("KotlinMutableSet")))
@interface SharedMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end

__attribute__((swift_name("KotlinMutableDictionary")))
@interface SharedMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end

@interface NSError (NSErrorSharedKotlinException)
@property (readonly) id _Nullable kotlinException;
@end

__attribute__((swift_name("KotlinNumber")))
@interface SharedNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end

__attribute__((swift_name("KotlinByte")))
@interface SharedByte : SharedNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end

__attribute__((swift_name("KotlinUByte")))
@interface SharedUByte : SharedNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end

__attribute__((swift_name("KotlinShort")))
@interface SharedShort : SharedNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end

__attribute__((swift_name("KotlinUShort")))
@interface SharedUShort : SharedNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end

__attribute__((swift_name("KotlinInt")))
@interface SharedInt : SharedNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end

__attribute__((swift_name("KotlinUInt")))
@interface SharedUInt : SharedNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end

__attribute__((swift_name("KotlinLong")))
@interface SharedLong : SharedNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end

__attribute__((swift_name("KotlinULong")))
@interface SharedULong : SharedNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end

__attribute__((swift_name("KotlinFloat")))
@interface SharedFloat : SharedNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end

__attribute__((swift_name("KotlinDouble")))
@interface SharedDouble : SharedNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end

__attribute__((swift_name("KotlinBoolean")))
@interface SharedBoolean : SharedNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ArticleDao")))
@interface SharedArticleDao : SharedBase
- (instancetype)initWithDb:(id<SharedDatabase>)db coroutineContext:(id<SharedKotlinCoroutineContext>)coroutineContext __attribute__((swift_name("init(db:coroutineContext:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)checkTitle:(NSString *)title completionHandler:(void (^)(SharedBoolean * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("check(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)deleteTitle:(NSString *)title completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("delete(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getTitle:(NSString *)title completionHandler:(void (^)(SharedArticleDb * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("get(title:completionHandler:)")));
- (NSArray<SharedArticle *> *)getAll __attribute__((swift_name("getAll()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertArticle:(SharedArticle *)article completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(article:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DatabaseDriverFactory")))
@interface SharedDatabaseDriverFactory : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (id<SharedRuntimeSqlDriver>)create __attribute__((swift_name("create()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileDao")))
@interface SharedProfileDao : SharedBase
- (instancetype)initWithDb:(id<SharedDatabase>)db __attribute__((swift_name("init(db:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)clearWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("clear(completionHandler:)")));
- (SharedProfileDb * _Nullable)get __attribute__((swift_name("get()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertData:(SharedProfileData *)data completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(data:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)updatePhotoPhotoPath:(NSString *)photoPath completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("updatePhoto(photoPath:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NetworkModule")))
@interface SharedNetworkModule : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)networkModule __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNetworkModule *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKoin_coreModule *api __attribute__((swift_name("api")));
@property (readonly) SharedKoin_coreModule *httpClient __attribute__((swift_name("httpClient")));
@property (readonly) SharedKoin_coreModule *json __attribute__((swift_name("json")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StorageModule")))
@interface SharedStorageModule : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)storageModule __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStorageModule *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKoin_coreModule *daoModule __attribute__((swift_name("daoModule")));
@property (readonly) SharedKoin_coreModule *dbModule __attribute__((swift_name("dbModule")));
@property (readonly) SharedKoin_coreModule *repositoryModule __attribute__((swift_name("repositoryModule")));
@end

__attribute__((swift_name("RuntimeTransacterBase")))
@protocol SharedRuntimeTransacterBase
@required
@end

__attribute__((swift_name("RuntimeSuspendingTransacter")))
@protocol SharedRuntimeSuspendingTransacter <SharedRuntimeTransacterBase>
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)transactionNoEnclosing:(BOOL)noEnclosing body:(id<SharedKotlinSuspendFunction1>)body completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("transaction(noEnclosing:body:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)transactionWithResultNoEnclosing:(BOOL)noEnclosing bodyWithReturn:(id<SharedKotlinSuspendFunction1>)bodyWithReturn completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("transactionWithResult(noEnclosing:bodyWithReturn:completionHandler:)")));
@end

__attribute__((swift_name("Database")))
@protocol SharedDatabase <SharedRuntimeSuspendingTransacter>
@required
@property (readonly) SharedArticleDbQueries *articleDbQueries __attribute__((swift_name("articleDbQueries")));
@property (readonly) SharedProfileDbQueries *profileDbQueries __attribute__((swift_name("profileDbQueries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DatabaseCompanion")))
@interface SharedDatabaseCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDatabaseCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedDatabase>)invokeDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("invoke(driver:)")));
@property (readonly) id<SharedRuntimeSqlSchema> Schema __attribute__((swift_name("Schema")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Greeting")))
@interface SharedGreeting : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (NSString *)greet __attribute__((swift_name("greet()")));
@end

__attribute__((swift_name("Platform")))
@protocol SharedPlatform
@required
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("IOSPlatform")))
@interface SharedIOSPlatform : SharedBase <SharedPlatform>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MR")))
@interface SharedMR : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)mR __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedMR *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("ResourceContainer")))
@protocol SharedResourceContainer
@required
- (NSArray<id> *)values __attribute__((swift_name("values()")));
@property (readonly) SharedResourcePlatformDetails *__platformDetails __attribute__((swift_name("__platformDetails")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MR.colors")))
@interface SharedMRColors : SharedBase <SharedResourceContainer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)colors __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedMRColors *shared __attribute__((swift_name("shared")));
- (NSArray<SharedColorResource *> *)values __attribute__((swift_name("values()")));
@property (readonly) SharedResourcePlatformDetails *__platformDetails __attribute__((swift_name("__platformDetails")));
@property (readonly) SharedColorResource *black __attribute__((swift_name("black")));
@property (readonly) SharedColorResource *grey __attribute__((swift_name("grey")));
@property (readonly) SharedColorResource *light_grey __attribute__((swift_name("light_grey")));
@property (readonly) SharedColorResource *loader __attribute__((swift_name("loader")));
@property (readonly) SharedColorResource *loader_background __attribute__((swift_name("loader_background")));
@property (readonly) SharedColorResource *loader_opaque __attribute__((swift_name("loader_opaque")));
@property (readonly) SharedColorResource *loader_opaque_background __attribute__((swift_name("loader_opaque_background")));
@property (readonly) SharedColorResource *loader_opaque_screen_background __attribute__((swift_name("loader_opaque_screen_background")));
@property (readonly) SharedColorResource *loader_screen_background __attribute__((swift_name("loader_screen_background")));
@property (readonly) SharedColorResource *primary __attribute__((swift_name("primary")));
@property (readonly) SharedColorResource *red __attribute__((swift_name("red")));
@property (readonly) SharedColorResource *white __attribute__((swift_name("white")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MR.fonts")))
@interface SharedMRFonts : SharedBase <SharedResourceContainer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)fonts __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedMRFonts *shared __attribute__((swift_name("shared")));
- (NSArray<SharedFontResource *> *)values __attribute__((swift_name("values()")));
@property (readonly) SharedResourcePlatformDetails *__platformDetails __attribute__((swift_name("__platformDetails")));
@property (readonly) SharedFontResource *lato_light __attribute__((swift_name("lato_light")));
@property (readonly) SharedFontResource *lato_medium __attribute__((swift_name("lato_medium")));
@property (readonly) SharedFontResource *lato_regular __attribute__((swift_name("lato_regular")));
@property (readonly) SharedFontResource *lato_semibold __attribute__((swift_name("lato_semibold")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MR.images")))
@interface SharedMRImages : SharedBase <SharedResourceContainer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)images __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedMRImages *shared __attribute__((swift_name("shared")));
- (NSArray<SharedImageResource *> *)values __attribute__((swift_name("values()")));
@property (readonly) SharedResourcePlatformDetails *__platformDetails __attribute__((swift_name("__platformDetails")));
@property (readonly) SharedImageResource *favorite_off_icon __attribute__((swift_name("favorite_off_icon")));
@property (readonly) SharedImageResource *favorite_on_icon __attribute__((swift_name("favorite_on_icon")));
@property (readonly) SharedImageResource *ic_titlebar_back __attribute__((swift_name("ic_titlebar_back")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MR.strings")))
@interface SharedMRStrings : SharedBase <SharedResourceContainer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)strings __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedMRStrings *shared __attribute__((swift_name("shared")));
- (NSArray<SharedStringResource *> *)values __attribute__((swift_name("values()")));
@property (readonly) SharedResourcePlatformDetails *__platformDetails __attribute__((swift_name("__platformDetails")));
@property (readonly) SharedStringResource *back __attribute__((swift_name("back")));
@property (readonly) SharedStringResource *berlin __attribute__((swift_name("berlin")));
@property (readonly) SharedStringResource *birth_date __attribute__((swift_name("birth_date")));
@property (readonly) SharedStringResource *city __attribute__((swift_name("city")));
@property (readonly) SharedStringResource *confirm __attribute__((swift_name("confirm")));
@property (readonly) SharedStringResource *confirm_pin __attribute__((swift_name("confirm_pin")));
@property (readonly) SharedStringResource *contact __attribute__((swift_name("contact")));
@property (readonly) SharedStringResource *country __attribute__((swift_name("country")));
@property (readonly) SharedStringResource *create_account __attribute__((swift_name("create_account")));
@property (readonly) SharedStringResource *email __attribute__((swift_name("email")));
@property (readonly) SharedStringResource *error __attribute__((swift_name("error")));
@property (readonly) SharedStringResource *favorites __attribute__((swift_name("favorites")));
@property (readonly) SharedStringResource *female __attribute__((swift_name("female")));
@property (readonly) SharedStringResource *first_name __attribute__((swift_name("first_name")));
@property (readonly) SharedStringResource *france __attribute__((swift_name("france")));
@property (readonly) SharedStringResource *gender __attribute__((swift_name("gender")));
@property (readonly) SharedStringResource *germany __attribute__((swift_name("germany")));
@property (readonly) SharedStringResource *invalid_phone_number __attribute__((swift_name("invalid_phone_number")));
@property (readonly) SharedStringResource *invalid_pin __attribute__((swift_name("invalid_pin")));
@property (readonly) SharedStringResource *last_name __attribute__((swift_name("last_name")));
@property (readonly) SharedStringResource *loading __attribute__((swift_name("loading")));
@property (readonly) SharedStringResource *location __attribute__((swift_name("location")));
@property (readonly) SharedStringResource *london __attribute__((swift_name("london")));
@property (readonly) SharedStringResource *male __attribute__((swift_name("male")));
@property (readonly, getter=doNew_york) SharedStringResource *new_york __attribute__((swift_name("new_york")));
@property (readonly) SharedStringResource *news __attribute__((swift_name("news")));
@property (readonly) SharedStringResource *other __attribute__((swift_name("other")));
@property (readonly) SharedStringResource *paris __attribute__((swift_name("paris")));
@property (readonly) SharedStringResource *personal_information __attribute__((swift_name("personal_information")));
@property (readonly) SharedStringResource *phone __attribute__((swift_name("phone")));
@property (readonly) SharedStringResource *phone_number __attribute__((swift_name("phone_number")));
@property (readonly) SharedStringResource *pin_helper_text __attribute__((swift_name("pin_helper_text")));
@property (readonly) SharedStringResource *pin_placeholder __attribute__((swift_name("pin_placeholder")));
@property (readonly) SharedStringResource *profile __attribute__((swift_name("profile")));
@property (readonly) SharedStringResource *retry __attribute__((swift_name("retry")));
@property (readonly) SharedStringResource *scr_details_open_button __attribute__((swift_name("scr_details_open_button")));
@property (readonly) SharedStringResource *scr_favorite_screen_title __attribute__((swift_name("scr_favorite_screen_title")));
@property (readonly) SharedStringResource *scr_favorite_tab_title __attribute__((swift_name("scr_favorite_tab_title")));
@property (readonly) SharedStringResource *scr_fridge_empty_recommendations __attribute__((swift_name("scr_fridge_empty_recommendations")));
@property (readonly) SharedStringResource *scr_fridge_products_title __attribute__((swift_name("scr_fridge_products_title")));
@property (readonly) SharedStringResource *scr_fridge_recommend_button __attribute__((swift_name("scr_fridge_recommend_button")));
@property (readonly) SharedStringResource *scr_fridge_recommendations_title __attribute__((swift_name("scr_fridge_recommendations_title")));
@property (readonly) SharedStringResource *scr_fridge_screen_title __attribute__((swift_name("scr_fridge_screen_title")));
@property (readonly) SharedStringResource *scr_fridge_tab_title __attribute__((swift_name("scr_fridge_tab_title")));
@property (readonly) SharedStringResource *scr_news_screen_title __attribute__((swift_name("scr_news_screen_title")));
@property (readonly) SharedStringResource *scr_news_search_placeholder __attribute__((swift_name("scr_news_search_placeholder")));
@property (readonly) SharedStringResource *scr_news_tab_title __attribute__((swift_name("scr_news_tab_title")));
@property (readonly) SharedStringResource *scr_profile_tab_title __attribute__((swift_name("scr_profile_tab_title")));
@property (readonly) SharedStringResource *scr_recipe_details_screen_title __attribute__((swift_name("scr_recipe_details_screen_title")));
@property (readonly) SharedStringResource *scr_recipe_ingredients_title __attribute__((swift_name("scr_recipe_ingredients_title")));
@property (readonly) SharedStringResource *scr_recipe_steps_title __attribute__((swift_name("scr_recipe_steps_title")));
@property (readonly) SharedStringResource *scr_recipes_screen_title __attribute__((swift_name("scr_recipes_screen_title")));
@property (readonly) SharedStringResource *scr_recipes_tab_title __attribute__((swift_name("scr_recipes_tab_title")));
@property (readonly) SharedStringResource *select __attribute__((swift_name("select")));
@property (readonly) SharedStringResource *sign_up __attribute__((swift_name("sign_up")));
@property (readonly) SharedStringResource *sign_up_failed __attribute__((swift_name("sign_up_failed")));
@property (readonly) SharedStringResource *sign_up_title __attribute__((swift_name("sign_up_title")));
@property (readonly) SharedStringResource *uk __attribute__((swift_name("uk")));
@property (readonly) SharedStringResource *usa __attribute__((swift_name("usa")));
@end

__attribute__((swift_name("BaseEvent")))
@protocol SharedBaseEvent
@required
@end

__attribute__((swift_name("Lifecycle_viewmodelViewModel")))
@interface SharedLifecycle_viewmodelViewModel : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithCloseables:(SharedKotlinArray<id<SharedKotlinAutoCloseable>> *)closeables __attribute__((swift_name("init(closeables:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithViewModelScope:(id<SharedKotlinx_coroutines_coreCoroutineScope>)viewModelScope __attribute__((swift_name("init(viewModelScope:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithViewModelScope:(id<SharedKotlinx_coroutines_coreCoroutineScope>)viewModelScope closeables:(SharedKotlinArray<id<SharedKotlinAutoCloseable>> *)closeables __attribute__((swift_name("init(viewModelScope:closeables:)"))) __attribute__((objc_designated_initializer));
- (void)addCloseableCloseable:(id<SharedKotlinAutoCloseable>)closeable __attribute__((swift_name("addCloseable(closeable:)")));
- (void)addCloseableKey:(NSString *)key closeable:(id<SharedKotlinAutoCloseable>)closeable __attribute__((swift_name("addCloseable(key:closeable:)")));
- (id<SharedKotlinAutoCloseable> _Nullable)getCloseableKey:(NSString *)key __attribute__((swift_name("getCloseable(key:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)onCleared __attribute__((swift_name("onCleared()")));
@end

__attribute__((swift_name("BaseViewModel")))
@interface SharedBaseViewModel<State, Event> : SharedLifecycle_viewmodelViewModel
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithCloseables:(SharedKotlinArray<id<SharedKotlinAutoCloseable>> *)closeables __attribute__((swift_name("init(closeables:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithViewModelScope:(id<SharedKotlinx_coroutines_coreCoroutineScope>)viewModelScope __attribute__((swift_name("init(viewModelScope:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithViewModelScope:(id<SharedKotlinx_coroutines_coreCoroutineScope>)viewModelScope closeables:(SharedKotlinArray<id<SharedKotlinAutoCloseable>> *)closeables __attribute__((swift_name("init(viewModelScope:closeables:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (NSString *)getStringStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("getString(stringRes:)")));
- (void)hideError __attribute__((swift_name("hideError()")));
- (void)hideLoader __attribute__((swift_name("hideLoader()")));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (State)initialState __attribute__((swift_name("initialState()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)navigateNavigationAction:(SharedNavigationAction *)navigationAction __attribute__((swift_name("navigate(navigationAction:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)navigateBack __attribute__((swift_name("navigateBack()")));
- (void)onDefaultUiEventEvent:(SharedDefaultUiEvent *)event __attribute__((swift_name("onDefaultUiEvent(event:)")));
- (void)onDestroy __attribute__((swift_name("onDestroy()")));
- (void)onScreenCreated __attribute__((swift_name("onScreenCreated()")));
- (void)onScreenDestroyed __attribute__((swift_name("onScreenDestroyed()")));
- (void)onScreenResumed __attribute__((swift_name("onScreenResumed()")));
- (void)pushEventEvent:(Event)event __attribute__((swift_name("pushEvent(event:)")));
- (void)showAlertAlert:(SharedErrorStateAlertError *)alert __attribute__((swift_name("showAlert(alert:)")));
- (void)showErrorError:(NSString *)error __attribute__((swift_name("showError(error:)")));
- (void)showLoader __attribute__((swift_name("showLoader()")));
- (void)updateStateBlock:(State (^)(State))block __attribute__((swift_name("updateState(block:)")));
@property (readonly) SharedCommonFlow<State> *stateFlow __attribute__((swift_name("stateFlow")));
@property (readonly) id<SharedDeviceService> deviceService __attribute__((swift_name("deviceService")));
@property (readonly) id<SharedKotlinx_coroutines_coreFlow> events __attribute__((swift_name("events")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> flowState __attribute__((swift_name("flowState")));
@property (readonly) SharedCommonFlow<SharedLceState *> *lceFlow __attribute__((swift_name("lceFlow")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> lceState __attribute__((swift_name("lceState")));
@property (readonly) SharedLceStateManager *lceStateManager __attribute__((swift_name("lceStateManager")));
@property (readonly) SharedCommonFlow<SharedNavigationAction *> *navigationEffectFlow __attribute__((swift_name("navigationEffectFlow")));
@property (readonly) State state __attribute__((swift_name("state")));
@property (readonly) id<SharedKotlinx_coroutines_coreMutableStateFlow> stateFlow_ __attribute__((swift_name("stateFlow_")));
@end

__attribute__((swift_name("BaseViewState")))
@protocol SharedBaseViewState
@required
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((swift_name("UiEvent")))
@protocol SharedUiEvent
@required
@end

__attribute__((swift_name("DefaultUiEvent")))
@interface SharedDefaultUiEvent : SharedBase <SharedUiEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefaultUiEvent.OnBackClicked")))
@interface SharedDefaultUiEventOnBackClicked : SharedDefaultUiEvent
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onBackClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDefaultUiEventOnBackClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefaultUiEvent.OnScreenCreated")))
@interface SharedDefaultUiEventOnScreenCreated : SharedDefaultUiEvent
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onScreenCreated __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDefaultUiEventOnScreenCreated *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefaultUiEvent.OnScreenDestroyed")))
@interface SharedDefaultUiEventOnScreenDestroyed : SharedDefaultUiEvent
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onScreenDestroyed __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDefaultUiEventOnScreenDestroyed *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DefaultUiEvent.OnScreenResumed")))
@interface SharedDefaultUiEventOnScreenResumed : SharedDefaultUiEvent
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onScreenResumed __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDefaultUiEventOnScreenResumed *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("SingleClickUiEvent")))
@protocol SharedSingleClickUiEvent <SharedUiEvent>
@required
@end

__attribute__((swift_name("ErrorState")))
@interface SharedErrorState : SharedBase
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ErrorState.AlertError")))
@interface SharedErrorStateAlertError : SharedErrorState
- (instancetype)initWithTitle:(NSString *)title message:(NSString *)message isCancellable:(BOOL)isCancellable positiveButtonText:(NSString *)positiveButtonText positiveAction:(void (^)(void))positiveAction negativeButtonText:(NSString *)negativeButtonText negativeAction:(void (^)(void))negativeAction __attribute__((swift_name("init(title:message:isCancellable:positiveButtonText:positiveAction:negativeButtonText:negativeAction:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedErrorStateAlertErrorCompanion *companion __attribute__((swift_name("companion")));
- (SharedErrorStateAlertError *)doCopyTitle:(NSString *)title message:(NSString *)message isCancellable:(BOOL)isCancellable positiveButtonText:(NSString *)positiveButtonText positiveAction:(void (^)(void))positiveAction negativeButtonText:(NSString *)negativeButtonText negativeAction:(void (^)(void))negativeAction __attribute__((swift_name("doCopy(title:message:isCancellable:positiveButtonText:positiveAction:negativeButtonText:negativeAction:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL isCancellable __attribute__((swift_name("isCancellable")));
@property (readonly) NSString *message __attribute__((swift_name("message")));
@property (readonly) void (^negativeAction)(void) __attribute__((swift_name("negativeAction")));
@property (readonly) NSString *negativeButtonText __attribute__((swift_name("negativeButtonText")));
@property (readonly) SharedTextState *negativeState __attribute__((swift_name("negativeState")));
@property (readonly) void (^positiveAction)(void) __attribute__((swift_name("positiveAction")));
@property (readonly) NSString *positiveButtonText __attribute__((swift_name("positiveButtonText")));
@property (readonly) SharedTextState *positiveState __attribute__((swift_name("positiveState")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ErrorState.AlertErrorCompanion")))
@interface SharedErrorStateAlertErrorCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedErrorStateAlertErrorCompanion *shared __attribute__((swift_name("shared")));
- (SharedErrorStateAlertError *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ErrorState.ApiAlertError")))
@interface SharedErrorStateApiAlertError : SharedErrorState
- (instancetype)initWithTitle:(NSString *)title isCancellable:(BOOL)isCancellable positiveButtonText:(NSString *)positiveButtonText positiveAction:(void (^)(void))positiveAction __attribute__((swift_name("init(title:isCancellable:positiveButtonText:positiveAction:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedErrorStateApiAlertErrorCompanion *companion __attribute__((swift_name("companion")));
- (SharedErrorStateApiAlertError *)doCopyTitle:(NSString *)title isCancellable:(BOOL)isCancellable positiveButtonText:(NSString *)positiveButtonText positiveAction:(void (^)(void))positiveAction __attribute__((swift_name("doCopy(title:isCancellable:positiveButtonText:positiveAction:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL isCancellable __attribute__((swift_name("isCancellable")));
@property (readonly) void (^positiveAction)(void) __attribute__((swift_name("positiveAction")));
@property (readonly) NSString *positiveButtonText __attribute__((swift_name("positiveButtonText")));
@property (readonly) SharedTextState *positiveState __attribute__((swift_name("positiveState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ErrorState.ApiAlertErrorCompanion")))
@interface SharedErrorStateApiAlertErrorCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedErrorStateApiAlertErrorCompanion *shared __attribute__((swift_name("shared")));
- (SharedErrorStateApiAlertError *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LceState")))
@interface SharedLceState : SharedBase
- (instancetype)initWithIsLoading:(BOOL)isLoading errorState:(SharedErrorState * _Nullable)errorState isRootScreen:(BOOL)isRootScreen __attribute__((swift_name("init(isLoading:errorState:isRootScreen:)"))) __attribute__((objc_designated_initializer));
- (SharedLceState *)doCopyIsLoading:(BOOL)isLoading errorState:(SharedErrorState * _Nullable)errorState isRootScreen:(BOOL)isRootScreen __attribute__((swift_name("doCopy(isLoading:errorState:isRootScreen:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedErrorState * _Nullable errorState __attribute__((swift_name("errorState")));
@property (readonly) BOOL isLoading __attribute__((swift_name("isLoading")));
@property (readonly) BOOL isRootScreen __attribute__((swift_name("isRootScreen")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LceStateManager")))
@interface SharedLceStateManager : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)hideError __attribute__((swift_name("hideError()")));
- (void)hideLoading __attribute__((swift_name("hideLoading()")));
- (BOOL)isLoading __attribute__((swift_name("isLoading()")));
- (void)showAlertErrorState:(SharedErrorStateAlertError *)errorState __attribute__((swift_name("showAlert(errorState:)")));
- (void)showErrorErrorState:(SharedErrorStateApiAlertError *)errorState __attribute__((swift_name("showError(errorState:)")));
- (void)showLoading __attribute__((swift_name("showLoading()")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> lceState __attribute__((swift_name("lceState")));
@end

__attribute__((swift_name("ButtonData")))
@interface SharedButtonData : SharedBase
- (SharedButtonData *)updateTextText:(NSString *)text __attribute__((swift_name("updateText(text:)")));
@property (readonly) SharedColorResource *color __attribute__((swift_name("color")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@end

__attribute__((swift_name("KotlinComparable")))
@protocol SharedKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end

__attribute__((swift_name("KotlinEnum")))
@interface SharedKotlinEnum<E> : SharedBase <SharedKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinEnumCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(E)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) int32_t ordinal __attribute__((swift_name("ordinal")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.Alignment")))
@interface SharedButtonDataAlignment : SharedKotlinEnum<SharedButtonDataAlignment *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedButtonDataAlignment *start __attribute__((swift_name("start")));
@property (class, readonly) SharedButtonDataAlignment *center __attribute__((swift_name("center")));
+ (SharedKotlinArray<SharedButtonDataAlignment *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedButtonDataAlignment *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.ColoredState")))
@interface SharedButtonDataColoredState : SharedKotlinEnum<SharedButtonDataColoredState *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedButtonDataColoredState *colored __attribute__((swift_name("colored")));
@property (class, readonly) SharedButtonDataColoredState *transparent __attribute__((swift_name("transparent")));
+ (SharedKotlinArray<SharedButtonDataColoredState *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedButtonDataColoredState *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.ImageButton")))
@interface SharedButtonDataImageButton : SharedButtonData
- (instancetype)initWithText:(NSString *)text background:(SharedColorResource *)background image:(SharedImageResource * _Nullable)image alignment:(SharedButtonDataAlignment *)alignment __attribute__((swift_name("init(text:background:image:alignment:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedButtonDataImageButtonCompanion *companion __attribute__((swift_name("companion")));
- (SharedButtonDataImageButton *)doCopyText:(NSString *)text background:(SharedColorResource *)background image:(SharedImageResource * _Nullable)image alignment:(SharedButtonDataAlignment *)alignment __attribute__((swift_name("doCopy(text:background:image:alignment:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
- (SharedButtonData *)updateImageImage:(SharedImageResource *)image __attribute__((swift_name("updateImage(image:)")));
- (SharedButtonData *)updateTextText:(NSString *)text __attribute__((swift_name("updateText(text:)")));
@property (readonly) SharedButtonDataAlignment *alignment __attribute__((swift_name("alignment")));
@property (readonly) SharedColorResource *background __attribute__((swift_name("background")));
@property (readonly) SharedColorResource *color __attribute__((swift_name("color")));
@property (readonly) SharedImageResource * _Nullable image __attribute__((swift_name("image")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.ImageButtonCompanion")))
@interface SharedButtonDataImageButtonCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedButtonDataImageButtonCompanion *shared __attribute__((swift_name("shared")));
- (SharedButtonDataImageButton *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.PrimaryButton")))
@interface SharedButtonDataPrimaryButton : SharedButtonData
- (instancetype)initWithText:(NSString *)text imageStart:(SharedImageResource * _Nullable)imageStart background:(SharedColorResource *)background coloredState:(SharedButtonDataColoredState *)coloredState __attribute__((swift_name("init(text:imageStart:background:coloredState:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedButtonDataPrimaryButtonCompanion *companion __attribute__((swift_name("companion")));
- (SharedButtonDataPrimaryButton *)doCopyText:(NSString *)text imageStart:(SharedImageResource * _Nullable)imageStart background:(SharedColorResource *)background coloredState:(SharedButtonDataColoredState *)coloredState __attribute__((swift_name("doCopy(text:imageStart:background:coloredState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
- (SharedButtonData *)updateImageImage:(SharedImageResource *)image __attribute__((swift_name("updateImage(image:)")));
- (SharedButtonData *)updateTextText:(NSString *)text __attribute__((swift_name("updateText(text:)")));
@property (readonly) SharedColorResource *background __attribute__((swift_name("background")));
@property (readonly) SharedColorResource *color __attribute__((swift_name("color")));
@property (readonly) SharedButtonDataColoredState *coloredState __attribute__((swift_name("coloredState")));
@property (readonly) SharedImageResource * _Nullable imageStart __attribute__((swift_name("imageStart")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonData.PrimaryButtonCompanion")))
@interface SharedButtonDataPrimaryButtonCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedButtonDataPrimaryButtonCompanion *shared __attribute__((swift_name("shared")));
- (SharedButtonDataPrimaryButton *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonState")))
@interface SharedButtonState : SharedBase
- (instancetype)initWithData:(SharedButtonData *)data isEnabled:(BOOL)isEnabled __attribute__((swift_name("init(data:isEnabled:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedButtonStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedButtonState *)doCopyData:(SharedButtonData *)data isEnabled:(BOOL)isEnabled __attribute__((swift_name("doCopy(data:isEnabled:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backgroundColor __attribute__((swift_name("backgroundColor")));
@property (readonly) SharedButtonDataColoredState *coloredState __attribute__((swift_name("coloredState")));
@property (readonly) SharedButtonData *data __attribute__((swift_name("data")));
@property (readonly) SharedImageResource * _Nullable image __attribute__((swift_name("image")));
@property (readonly) BOOL isEnabled __attribute__((swift_name("isEnabled")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ButtonState.Companion")))
@interface SharedButtonStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedButtonStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedButtonState *)imageValue:(NSString *)value image:(SharedImageResource * _Nullable)image background:(SharedColorResource *)background coloredState:(SharedButtonDataColoredState *)coloredState __attribute__((swift_name("image(value:image:background:coloredState:)")));
- (SharedButtonState *)primaryValue:(NSString *)value image:(SharedImageResource * _Nullable)image background:(SharedColorResource *)background coloredState:(SharedButtonDataColoredState *)coloredState __attribute__((swift_name("primary(value:image:background:coloredState:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DropdownFieldState")))
@interface SharedDropdownFieldState : SharedBase
- (instancetype)initWithValue:(NSString *)value placeholder:(NSString *)placeholder label:(NSString * _Nullable)label options:(NSArray<NSString *> *)options isEnabled:(BOOL)isEnabled backgroundColor:(SharedColorResource *)backgroundColor textColor:(SharedColorResource *)textColor __attribute__((swift_name("init(value:placeholder:label:options:isEnabled:backgroundColor:textColor:)"))) __attribute__((objc_designated_initializer));
- (SharedDropdownFieldState *)doCopyValue:(NSString *)value placeholder:(NSString *)placeholder label:(NSString * _Nullable)label options:(NSArray<NSString *> *)options isEnabled:(BOOL)isEnabled backgroundColor:(SharedColorResource *)backgroundColor textColor:(SharedColorResource *)textColor __attribute__((swift_name("doCopy(value:placeholder:label:options:isEnabled:backgroundColor:textColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backgroundColor __attribute__((swift_name("backgroundColor")));
@property (readonly) BOOL isEnabled __attribute__((swift_name("isEnabled")));
@property (readonly) NSString * _Nullable label __attribute__((swift_name("label")));
@property (readonly) NSArray<NSString *> *options __attribute__((swift_name("options")));
@property (readonly) NSString *placeholder __attribute__((swift_name("placeholder")));
@property (readonly) SharedColorResource *textColor __attribute__((swift_name("textColor")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextFieldState")))
@interface SharedTextFieldState : SharedBase
- (instancetype)initWithValue:(NSString *)value placeholder:(NSString *)placeholder label:(NSString * _Nullable)label error:(NSString * _Nullable)error isEnabled:(BOOL)isEnabled keyboardType:(SharedTextFieldStateKeyboardType *)keyboardType backgroundColor:(SharedColorResource *)backgroundColor textColor:(SharedColorResource *)textColor __attribute__((swift_name("init(value:placeholder:label:error:isEnabled:keyboardType:backgroundColor:textColor:)"))) __attribute__((objc_designated_initializer));
- (SharedTextFieldState *)doCopyValue:(NSString *)value placeholder:(NSString *)placeholder label:(NSString * _Nullable)label error:(NSString * _Nullable)error isEnabled:(BOOL)isEnabled keyboardType:(SharedTextFieldStateKeyboardType *)keyboardType backgroundColor:(SharedColorResource *)backgroundColor textColor:(SharedColorResource *)textColor __attribute__((swift_name("doCopy(value:placeholder:label:error:isEnabled:keyboardType:backgroundColor:textColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backgroundColor __attribute__((swift_name("backgroundColor")));
@property (readonly) NSString * _Nullable error __attribute__((swift_name("error")));
@property (readonly) BOOL isEnabled __attribute__((swift_name("isEnabled")));
@property (readonly) SharedTextFieldStateKeyboardType *keyboardType __attribute__((swift_name("keyboardType")));
@property (readonly) NSString * _Nullable label __attribute__((swift_name("label")));
@property (readonly) NSString *placeholder __attribute__((swift_name("placeholder")));
@property (readonly) SharedColorResource *textColor __attribute__((swift_name("textColor")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextFieldState.KeyboardType")))
@interface SharedTextFieldStateKeyboardType : SharedKotlinEnum<SharedTextFieldStateKeyboardType *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedTextFieldStateKeyboardType *text __attribute__((swift_name("text")));
@property (class, readonly) SharedTextFieldStateKeyboardType *number __attribute__((swift_name("number")));
@property (class, readonly) SharedTextFieldStateKeyboardType *email __attribute__((swift_name("email")));
@property (class, readonly) SharedTextFieldStateKeyboardType *phone __attribute__((swift_name("phone")));
+ (SharedKotlinArray<SharedTextFieldStateKeyboardType *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedTextFieldStateKeyboardType *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextFontState")))
@interface SharedTextFontState : SharedBase
- (instancetype)initWithFont:(SharedFontResource *)font fontSize:(int32_t)fontSize lineHeight:(int32_t)lineHeight __attribute__((swift_name("init(font:fontSize:lineHeight:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedTextFontStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedTextFontState *)doCopyFont:(SharedFontResource *)font fontSize:(int32_t)fontSize lineHeight:(int32_t)lineHeight __attribute__((swift_name("doCopy(font:fontSize:lineHeight:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedFontResource *font __attribute__((swift_name("font")));
@property (readonly) int32_t fontSize __attribute__((swift_name("fontSize")));
@property (readonly) int32_t lineHeight __attribute__((swift_name("lineHeight")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextFontState.Companion")))
@interface SharedTextFontStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedTextFontStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedTextFontState *)latoLightSize:(int32_t)size lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoLight(size:lineHeight:)")));
- (SharedTextFontState *)latoMediumSize:(int32_t)size lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoMedium(size:lineHeight:)")));
- (SharedTextFontState *)latoRegularSize:(int32_t)size lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoRegular(size:lineHeight:)")));
- (SharedTextFontState *)latoSemiboldSize:(int32_t)size lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoSemibold(size:lineHeight:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextState")))
@interface SharedTextState : SharedBase
- (instancetype)initWithFontState:(SharedTextFontState *)fontState color:(SharedColorResource *)color value:(NSString *)value iconStart:(SharedImageResource * _Nullable)iconStart iconEnd:(SharedImageResource * _Nullable)iconEnd overrideIconsTint:(BOOL)overrideIconsTint __attribute__((swift_name("init(fontState:color:value:iconStart:iconEnd:overrideIconsTint:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedTextStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedTextState *)doCopyFontState:(SharedTextFontState *)fontState color:(SharedColorResource *)color value:(NSString *)value iconStart:(SharedImageResource * _Nullable)iconStart iconEnd:(SharedImageResource * _Nullable)iconEnd overrideIconsTint:(BOOL)overrideIconsTint __attribute__((swift_name("doCopy(fontState:color:value:iconStart:iconEnd:overrideIconsTint:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *color __attribute__((swift_name("color")));
@property (readonly) SharedTextFontState *fontState __attribute__((swift_name("fontState")));
@property (readonly) SharedImageResource * _Nullable iconEnd __attribute__((swift_name("iconEnd")));
@property (readonly) SharedImageResource * _Nullable iconStart __attribute__((swift_name("iconStart")));
@property (readonly) BOOL overrideIconsTint __attribute__((swift_name("overrideIconsTint")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TextState.Companion")))
@interface SharedTextStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedTextStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedTextState *)latoLightSize:(int32_t)size color:(SharedColorResource *)color lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoLight(size:color:lineHeight:)")));
- (SharedTextState *)latoMediumSize:(int32_t)size color:(SharedColorResource *)color lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoMedium(size:color:lineHeight:)")));
- (SharedTextState *)latoRegularSize:(int32_t)size color:(SharedColorResource *)color lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoRegular(size:color:lineHeight:)")));
- (SharedTextState *)latoSemiboldSize:(int32_t)size color:(SharedColorResource *)color lineHeight:(int32_t)lineHeight __attribute__((swift_name("latoSemibold(size:color:lineHeight:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TitleBarState")))
@interface SharedTitleBarState : SharedBase
- (instancetype)initWithTitle:(SharedTextState *)title isNavigateBackVisible:(BOOL)isNavigateBackVisible backIcon:(SharedImageResource *)backIcon contentColor:(SharedColorResource *)contentColor onDefaultUiEvent:(void (^)(SharedDefaultUiEvent *))onDefaultUiEvent __attribute__((swift_name("init(title:isNavigateBackVisible:backIcon:contentColor:onDefaultUiEvent:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedTitleBarStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedTitleBarState *)doCopyTitle:(SharedTextState *)title isNavigateBackVisible:(BOOL)isNavigateBackVisible backIcon:(SharedImageResource *)backIcon contentColor:(SharedColorResource *)contentColor onDefaultUiEvent:(void (^)(SharedDefaultUiEvent *))onDefaultUiEvent __attribute__((swift_name("doCopy(title:isNavigateBackVisible:backIcon:contentColor:onDefaultUiEvent:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedImageResource *backIcon __attribute__((swift_name("backIcon")));
@property (readonly) SharedColorResource *contentColor __attribute__((swift_name("contentColor")));
@property (readonly) BOOL isNavigateBackVisible __attribute__((swift_name("isNavigateBackVisible")));
@property (readonly) void (^onDefaultUiEvent)(SharedDefaultUiEvent *) __attribute__((swift_name("onDefaultUiEvent")));
@property (readonly) SharedTextState *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TitleBarState.Companion")))
@interface SharedTitleBarStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedTitleBarStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedTitleBarState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ArticleDb")))
@interface SharedArticleDb : SharedBase
- (instancetype)initWithAuthor:(NSString * _Nullable)author title:(NSString * _Nullable)title description:(NSString * _Nullable)description url:(NSString * _Nullable)url urlToImage:(NSString * _Nullable)urlToImage publishedAt:(NSString * _Nullable)publishedAt content:(NSString * _Nullable)content __attribute__((swift_name("init(author:title:description:url:urlToImage:publishedAt:content:)"))) __attribute__((objc_designated_initializer));
- (SharedArticleDb *)doCopyAuthor:(NSString * _Nullable)author title:(NSString * _Nullable)title description:(NSString * _Nullable)description url:(NSString * _Nullable)url urlToImage:(NSString * _Nullable)urlToImage publishedAt:(NSString * _Nullable)publishedAt content:(NSString * _Nullable)content __attribute__((swift_name("doCopy(author:title:description:url:urlToImage:publishedAt:content:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable author __attribute__((swift_name("author")));
@property (readonly) NSString * _Nullable content __attribute__((swift_name("content")));
@property (readonly) NSString * _Nullable description_ __attribute__((swift_name("description_")));
@property (readonly) NSString * _Nullable publishedAt __attribute__((swift_name("publishedAt")));
@property (readonly) NSString * _Nullable title __attribute__((swift_name("title")));
@property (readonly) NSString * _Nullable url __attribute__((swift_name("url")));
@property (readonly) NSString * _Nullable urlToImage __attribute__((swift_name("urlToImage")));
@end

__attribute__((swift_name("RuntimeBaseTransacterImpl")))
@interface SharedRuntimeBaseTransacterImpl : SharedBase
- (instancetype)initWithDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("init(driver:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (NSString *)createArgumentsCount:(int32_t)count __attribute__((swift_name("createArguments(count:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)notifyQueriesIdentifier:(int32_t)identifier tableProvider:(void (^)(SharedKotlinUnit *(^)(NSString *)))tableProvider __attribute__((swift_name("notifyQueries(identifier:tableProvider:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (id _Nullable)postTransactionCleanupTransaction:(SharedRuntimeTransacterTransaction *)transaction enclosing:(SharedRuntimeTransacterTransaction * _Nullable)enclosing thrownException:(SharedKotlinThrowable * _Nullable)thrownException returnValue:(id _Nullable)returnValue __attribute__((swift_name("postTransactionCleanup(transaction:enclosing:thrownException:returnValue:)")));

/**
 * @note This property has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
@property (readonly) id<SharedRuntimeSqlDriver> driver __attribute__((swift_name("driver")));
@end

__attribute__((swift_name("RuntimeSuspendingTransacterImpl")))
@interface SharedRuntimeSuspendingTransacterImpl : SharedRuntimeBaseTransacterImpl <SharedRuntimeSuspendingTransacter>
- (instancetype)initWithDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("init(driver:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)transactionNoEnclosing:(BOOL)noEnclosing body:(id<SharedKotlinSuspendFunction1>)body completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("transaction(noEnclosing:body:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)transactionWithResultNoEnclosing:(BOOL)noEnclosing bodyWithReturn:(id<SharedKotlinSuspendFunction1>)bodyWithReturn completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("transactionWithResult(noEnclosing:bodyWithReturn:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ArticleDbQueries")))
@interface SharedArticleDbQueries : SharedRuntimeSuspendingTransacterImpl
- (instancetype)initWithDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("init(driver:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)clearWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("clear(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)deleteTitle:(NSString * _Nullable)title completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("delete(title:completionHandler:)")));
- (SharedRuntimeQuery<SharedArticleDb *> *)getTitle:(NSString * _Nullable)title __attribute__((swift_name("get(title:)")));
- (SharedRuntimeQuery<id> *)getTitle:(NSString * _Nullable)title mapper:(id (^)(NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable))mapper __attribute__((swift_name("get(title:mapper:)")));
- (SharedRuntimeQuery<SharedArticleDb *> *)getAll __attribute__((swift_name("getAll()")));
- (SharedRuntimeQuery<id> *)getAllMapper:(id (^)(NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable, NSString * _Nullable))mapper __attribute__((swift_name("getAll(mapper:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertArticleDb:(SharedArticleDb *)ArticleDb completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(ArticleDb:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileDb")))
@interface SharedProfileDb : SharedBase
- (instancetype)initWithId:(int64_t)id firstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath __attribute__((swift_name("init(id:firstName:lastName:gender:birthDate:country:city:email:phone:photoPath:)"))) __attribute__((objc_designated_initializer));
- (SharedProfileDb *)doCopyId:(int64_t)id firstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath __attribute__((swift_name("doCopy(id:firstName:lastName:gender:birthDate:country:city:email:phone:photoPath:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *birthDate __attribute__((swift_name("birthDate")));
@property (readonly) NSString *city __attribute__((swift_name("city")));
@property (readonly) NSString *country __attribute__((swift_name("country")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) NSString *firstName __attribute__((swift_name("firstName")));
@property (readonly) NSString *gender __attribute__((swift_name("gender")));
@property (readonly) int64_t id __attribute__((swift_name("id")));
@property (readonly) NSString *lastName __attribute__((swift_name("lastName")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@property (readonly) NSString *photoPath __attribute__((swift_name("photoPath")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileDbQueries")))
@interface SharedProfileDbQueries : SharedRuntimeSuspendingTransacterImpl
- (instancetype)initWithDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("init(driver:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)clearWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("clear(completionHandler:)")));
- (SharedRuntimeQuery<SharedProfileDb *> *)get __attribute__((swift_name("get()")));
- (SharedRuntimeQuery<id> *)getMapper:(id (^)(SharedLong *, NSString *, NSString *, NSString *, NSString *, NSString *, NSString *, NSString *, NSString *, NSString *))mapper __attribute__((swift_name("get(mapper:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(firstName:lastName:gender:birthDate:country:city:email:phone:photoPath:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)updatePhotoPhotoPath:(NSString *)photoPath completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("updatePhoto(photoPath:completionHandler:)")));
@end

__attribute__((swift_name("KotlinThrowable")))
@interface SharedKotlinThrowable : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));

/**
 * @note annotations
 *   kotlin.experimental.ExperimentalNativeApi
*/
- (SharedKotlinArray<NSString *> *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinThrowable * _Nullable cause __attribute__((swift_name("cause")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
- (NSError *)asError __attribute__((swift_name("asError()")));
@end

__attribute__((swift_name("KotlinException")))
@interface SharedKotlinException : SharedKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("AuthError")))
@interface SharedAuthError : SharedKotlinException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AuthError.InvalidData")))
@interface SharedAuthErrorInvalidData : SharedAuthError
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)invalidData __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedAuthErrorInvalidData *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AuthError.InvalidPhone")))
@interface SharedAuthErrorInvalidPhone : SharedAuthError
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)invalidPhone __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedAuthErrorInvalidPhone *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("AuthService")))
@protocol SharedAuthService
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)loginPhone:(NSString *)phone completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("login(phone:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)logoutWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("logout(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)signUpData:(SharedSignUpData *)data completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("signUp(data:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)verifyPinPin:(NSString *)pin completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("verifyPin(pin:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AuthServiceImpl")))
@interface SharedAuthServiceImpl : SharedBase <SharedAuthService>
- (instancetype)initWithProfileRepository:(id<SharedProfileRepository>)profileRepository __attribute__((swift_name("init(profileRepository:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)loginPhone:(NSString *)phone completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("login(phone:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)logoutWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("logout(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)signUpData:(SharedSignUpData *)data completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("signUp(data:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)verifyPinPin:(NSString *)pin completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("verifyPin(pin:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpData")))
@interface SharedSignUpData : SharedBase
- (instancetype)initWithFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone __attribute__((swift_name("init(firstName:lastName:gender:birthDate:country:city:email:phone:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpData *)doCopyFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone __attribute__((swift_name("doCopy(firstName:lastName:gender:birthDate:country:city:email:phone:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *birthDate __attribute__((swift_name("birthDate")));
@property (readonly) NSString *city __attribute__((swift_name("city")));
@property (readonly) NSString *country __attribute__((swift_name("country")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) NSString *firstName __attribute__((swift_name("firstName")));
@property (readonly) NSString *gender __attribute__((swift_name("gender")));
@property (readonly) NSString *lastName __attribute__((swift_name("lastName")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@end

__attribute__((swift_name("ValidationService")))
@protocol SharedValidationService
@required
- (BOOL)isEmailValidEmail:(NSString *)email __attribute__((swift_name("isEmailValid(email:)")));
- (BOOL)isNameValidName:(NSString *)name __attribute__((swift_name("isNameValid(name:)")));
- (BOOL)isPhoneValidPhone:(NSString *)phone __attribute__((swift_name("isPhoneValid(phone:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ValidationServiceImpl")))
@interface SharedValidationServiceImpl : SharedBase <SharedValidationService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)isEmailValidEmail:(NSString *)email __attribute__((swift_name("isEmailValid(email:)")));
- (BOOL)isNameValidName:(NSString *)name __attribute__((swift_name("isNameValid(name:)")));
- (BOOL)isPhoneValidPhone:(NSString *)phone __attribute__((swift_name("isPhoneValid(phone:)")));
@end

__attribute__((swift_name("LoginEvents")))
@interface SharedLoginEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoginEvents.LoginButtonTapped")))
@interface SharedLoginEventsLoginButtonTapped : SharedLoginEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)loginButtonTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedLoginEventsLoginButtonTapped *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoginEvents.PhoneChanged")))
@interface SharedLoginEventsPhoneChanged : SharedLoginEvents
- (instancetype)initWithPhone:(NSString *)phone __attribute__((swift_name("init(phone:)"))) __attribute__((objc_designated_initializer));
- (SharedLoginEventsPhoneChanged *)doCopyPhone:(NSString *)phone __attribute__((swift_name("doCopy(phone:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoginEvents.SignUpButtonTapped")))
@interface SharedLoginEventsSignUpButtonTapped : SharedLoginEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)signUpButtonTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedLoginEventsSignUpButtonTapped *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoginState")))
@interface SharedLoginState : SharedBase <SharedBaseViewState>
- (instancetype)initWithPhone:(NSString *)phone isLoading:(BOOL)isLoading errorMessage:(NSString * _Nullable)errorMessage isPhoneValid:(BOOL)isPhoneValid phoneFieldState:(SharedTextFieldState *)phoneFieldState confirmButtonState:(SharedButtonState *)confirmButtonState signUpButtonState:(SharedTextState *)signUpButtonState errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(phone:isLoading:errorMessage:isPhoneValid:phoneFieldState:confirmButtonState:signUpButtonState:errorTextState:titleBarState:)"))) __attribute__((objc_designated_initializer));
- (SharedLoginState *)doCopyPhone:(NSString *)phone isLoading:(BOOL)isLoading errorMessage:(NSString * _Nullable)errorMessage isPhoneValid:(BOOL)isPhoneValid phoneFieldState:(SharedTextFieldState *)phoneFieldState confirmButtonState:(SharedButtonState *)confirmButtonState signUpButtonState:(SharedTextState *)signUpButtonState errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(phone:isLoading:errorMessage:isPhoneValid:phoneFieldState:confirmButtonState:signUpButtonState:errorTextState:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedButtonState *confirmButtonState __attribute__((swift_name("confirmButtonState")));
@property (readonly) NSString * _Nullable errorMessage __attribute__((swift_name("errorMessage")));
@property (readonly) SharedTextState * _Nullable errorTextState __attribute__((swift_name("errorTextState")));
@property (readonly) BOOL isLoading __attribute__((swift_name("isLoading")));
@property (readonly) BOOL isPhoneValid __attribute__((swift_name("isPhoneValid")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@property (readonly) SharedTextFieldState *phoneFieldState __attribute__((swift_name("phoneFieldState")));
@property (readonly) SharedTextState *signUpButtonState __attribute__((swift_name("signUpButtonState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LoginViewModel")))
@interface SharedLoginViewModel : SharedBaseViewModel<SharedLoginState *, SharedLoginEvents *>
- (instancetype)initWithAuthService:(id<SharedAuthService>)authService validationService:(id<SharedValidationService>)validationService __attribute__((swift_name("init(authService:validationService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedLoginState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((swift_name("PinEvents")))
@interface SharedPinEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PinEvents.ConfirmTapped")))
@interface SharedPinEventsConfirmTapped : SharedPinEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)confirmTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedPinEventsConfirmTapped *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PinEvents.PinChanged")))
@interface SharedPinEventsPinChanged : SharedPinEvents
- (instancetype)initWithPin:(NSString *)pin __attribute__((swift_name("init(pin:)"))) __attribute__((objc_designated_initializer));
- (SharedPinEventsPinChanged *)doCopyPin:(NSString *)pin __attribute__((swift_name("doCopy(pin:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *pin __attribute__((swift_name("pin")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PinState")))
@interface SharedPinState : SharedBase <SharedBaseViewState>
- (instancetype)initWithPin:(NSString *)pin isLoading:(BOOL)isLoading isPinValid:(BOOL)isPinValid errorMessage:(NSString * _Nullable)errorMessage pinFieldState:(SharedTextFieldState *)pinFieldState confirmButtonState:(SharedButtonState *)confirmButtonState helperTextState:(SharedTextState *)helperTextState errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(pin:isLoading:isPinValid:errorMessage:pinFieldState:confirmButtonState:helperTextState:errorTextState:titleBarState:)"))) __attribute__((objc_designated_initializer));
- (SharedPinState *)doCopyPin:(NSString *)pin isLoading:(BOOL)isLoading isPinValid:(BOOL)isPinValid errorMessage:(NSString * _Nullable)errorMessage pinFieldState:(SharedTextFieldState *)pinFieldState confirmButtonState:(SharedButtonState *)confirmButtonState helperTextState:(SharedTextState *)helperTextState errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(pin:isLoading:isPinValid:errorMessage:pinFieldState:confirmButtonState:helperTextState:errorTextState:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedButtonState *confirmButtonState __attribute__((swift_name("confirmButtonState")));
@property (readonly) NSString * _Nullable errorMessage __attribute__((swift_name("errorMessage")));
@property (readonly) SharedTextState * _Nullable errorTextState __attribute__((swift_name("errorTextState")));
@property (readonly) SharedTextState *helperTextState __attribute__((swift_name("helperTextState")));
@property (readonly) BOOL isLoading __attribute__((swift_name("isLoading")));
@property (readonly) BOOL isPinValid __attribute__((swift_name("isPinValid")));
@property (readonly) NSString *pin __attribute__((swift_name("pin")));
@property (readonly) SharedTextFieldState *pinFieldState __attribute__((swift_name("pinFieldState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PinViewModel")))
@interface SharedPinViewModel : SharedBaseViewModel<SharedPinState *, SharedPinEvents *>
- (instancetype)initWithAuthService:(id<SharedAuthService>)authService __attribute__((swift_name("init(authService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedPinState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((swift_name("SignUpEvents")))
@interface SharedSignUpEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.BackButtonTapped")))
@interface SharedSignUpEventsBackButtonTapped : SharedSignUpEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)backButtonTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedSignUpEventsBackButtonTapped *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.BirthDateChanged")))
@interface SharedSignUpEventsBirthDateChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsBirthDateChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.CityChanged")))
@interface SharedSignUpEventsCityChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsCityChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.CountryChanged")))
@interface SharedSignUpEventsCountryChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsCountryChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.CreateAccountTapped")))
@interface SharedSignUpEventsCreateAccountTapped : SharedSignUpEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)createAccountTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedSignUpEventsCreateAccountTapped *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.EmailChanged")))
@interface SharedSignUpEventsEmailChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsEmailChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.FirstNameChanged")))
@interface SharedSignUpEventsFirstNameChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsFirstNameChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.GenderChanged")))
@interface SharedSignUpEventsGenderChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsGenderChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.LastNameChanged")))
@interface SharedSignUpEventsLastNameChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsLastNameChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpEvents.PhoneChanged")))
@interface SharedSignUpEventsPhoneChanged : SharedSignUpEvents
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpEventsPhoneChanged *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpState")))
@interface SharedSignUpState : SharedBase <SharedBaseViewState>
- (instancetype)initWithFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone isLoading:(BOOL)isLoading isFormValid:(BOOL)isFormValid errorMessage:(NSString * _Nullable)errorMessage genderOptions:(NSArray<NSString *> *)genderOptions countryOptions:(NSArray<NSString *> *)countryOptions cityOptions:(NSArray<NSString *> *)cityOptions firstNameField:(SharedTextFieldState *)firstNameField lastNameField:(SharedTextFieldState *)lastNameField genderField:(SharedDropdownFieldState *)genderField birthDateField:(SharedTextFieldState *)birthDateField countryField:(SharedDropdownFieldState *)countryField cityField:(SharedDropdownFieldState *)cityField emailField:(SharedTextFieldState *)emailField phoneField:(SharedTextFieldState *)phoneField createAccountButton:(SharedButtonState *)createAccountButton errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(firstName:lastName:gender:birthDate:country:city:email:phone:isLoading:isFormValid:errorMessage:genderOptions:countryOptions:cityOptions:firstNameField:lastNameField:genderField:birthDateField:countryField:cityField:emailField:phoneField:createAccountButton:errorTextState:titleBarState:)"))) __attribute__((objc_designated_initializer));
- (SharedSignUpState *)doCopyFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone isLoading:(BOOL)isLoading isFormValid:(BOOL)isFormValid errorMessage:(NSString * _Nullable)errorMessage genderOptions:(NSArray<NSString *> *)genderOptions countryOptions:(NSArray<NSString *> *)countryOptions cityOptions:(NSArray<NSString *> *)cityOptions firstNameField:(SharedTextFieldState *)firstNameField lastNameField:(SharedTextFieldState *)lastNameField genderField:(SharedDropdownFieldState *)genderField birthDateField:(SharedTextFieldState *)birthDateField countryField:(SharedDropdownFieldState *)countryField cityField:(SharedDropdownFieldState *)cityField emailField:(SharedTextFieldState *)emailField phoneField:(SharedTextFieldState *)phoneField createAccountButton:(SharedButtonState *)createAccountButton errorTextState:(SharedTextState * _Nullable)errorTextState titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(firstName:lastName:gender:birthDate:country:city:email:phone:isLoading:isFormValid:errorMessage:genderOptions:countryOptions:cityOptions:firstNameField:lastNameField:genderField:birthDateField:countryField:cityField:emailField:phoneField:createAccountButton:errorTextState:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *birthDate __attribute__((swift_name("birthDate")));
@property (readonly) SharedTextFieldState *birthDateField __attribute__((swift_name("birthDateField")));
@property (readonly) NSString *city __attribute__((swift_name("city")));
@property (readonly) SharedDropdownFieldState *cityField __attribute__((swift_name("cityField")));
@property (readonly) NSArray<NSString *> *cityOptions __attribute__((swift_name("cityOptions")));
@property (readonly) NSString *country __attribute__((swift_name("country")));
@property (readonly) SharedDropdownFieldState *countryField __attribute__((swift_name("countryField")));
@property (readonly) NSArray<NSString *> *countryOptions __attribute__((swift_name("countryOptions")));
@property (readonly) SharedButtonState *createAccountButton __attribute__((swift_name("createAccountButton")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) SharedTextFieldState *emailField __attribute__((swift_name("emailField")));
@property (readonly) NSString * _Nullable errorMessage __attribute__((swift_name("errorMessage")));
@property (readonly) SharedTextState * _Nullable errorTextState __attribute__((swift_name("errorTextState")));
@property (readonly) NSString *firstName __attribute__((swift_name("firstName")));
@property (readonly) SharedTextFieldState *firstNameField __attribute__((swift_name("firstNameField")));
@property (readonly) NSString *gender __attribute__((swift_name("gender")));
@property (readonly) SharedDropdownFieldState *genderField __attribute__((swift_name("genderField")));
@property (readonly) NSArray<NSString *> *genderOptions __attribute__((swift_name("genderOptions")));
@property (readonly) BOOL isFormValid __attribute__((swift_name("isFormValid")));
@property (readonly) BOOL isLoading __attribute__((swift_name("isLoading")));
@property (readonly) NSString *lastName __attribute__((swift_name("lastName")));
@property (readonly) SharedTextFieldState *lastNameField __attribute__((swift_name("lastNameField")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@property (readonly) SharedTextFieldState *phoneField __attribute__((swift_name("phoneField")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SignUpViewModel")))
@interface SharedSignUpViewModel : SharedBaseViewModel<SharedSignUpState *, SharedSignUpEvents *>
- (instancetype)initWithAuthService:(id<SharedAuthService>)authService validationService:(id<SharedValidationService>)validationService __attribute__((swift_name("init(authService:validationService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedSignUpState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((swift_name("DeviceService")))
@protocol SharedDeviceService
@required
- (BOOL)isAndroid __attribute__((swift_name("isAndroid()")));
- (BOOL)isIOS __attribute__((swift_name("isIOS()")));
- (void)openMailToSupportMail:(NSString *)mail __attribute__((swift_name("openMailToSupport(mail:)")));
- (void)openUrlUrlString:(NSString *)urlString __attribute__((swift_name("openUrl(urlString:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DeviceServiceImpl")))
@interface SharedDeviceServiceImpl : SharedBase <SharedDeviceService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (BOOL)isAndroid __attribute__((swift_name("isAndroid()")));
- (BOOL)isIOS __attribute__((swift_name("isIOS()")));
- (void)openMailToSupportMail:(NSString *)mail __attribute__((swift_name("openMailToSupport(mail:)")));
- (void)openUrlUrlString:(NSString *)urlString __attribute__((swift_name("openUrl(urlString:)")));
@end

__attribute__((swift_name("ResourceService")))
@protocol SharedResourceService
@required
- (NSString *)getStringStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("getString(stringRes:)")));
- (NSString *)getStringStringRes:(SharedStringResource *)stringRes args:(NSArray<NSString *> *)args __attribute__((swift_name("getString(stringRes:args:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ResourceServiceImpl")))
@interface SharedResourceServiceImpl : SharedBase <SharedResourceService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (NSString *)getStringStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("getString(stringRes:)")));
- (NSString *)getStringStringRes:(SharedStringResource *)stringRes args:(NSArray<NSString *> *)args __attribute__((swift_name("getString(stringRes:args:)")));
@end

__attribute__((swift_name("FavoriteDetailsEvents")))
@interface SharedFavoriteDetailsEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteDetailsEvents.OnOpenClicked")))
@interface SharedFavoriteDetailsEventsOnOpenClicked : SharedFavoriteDetailsEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onOpenClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFavoriteDetailsEventsOnOpenClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteDetailsState")))
@interface SharedFavoriteDetailsState : SharedBase <SharedBaseViewState>
- (instancetype)initWithImageUrl:(NSString * _Nullable)imageUrl dateState:(SharedTextState *)dateState titleState:(SharedTextState *)titleState textState:(SharedTextState *)textState favoriteButton:(SharedButtonState *)favoriteButton openButton:(SharedButtonState *)openButton titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(imageUrl:dateState:titleState:textState:favoriteButton:openButton:titleBarState:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedFavoriteDetailsStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedFavoriteDetailsState *)doCopyImageUrl:(NSString * _Nullable)imageUrl dateState:(SharedTextState *)dateState titleState:(SharedTextState *)titleState textState:(SharedTextState *)textState favoriteButton:(SharedButtonState *)favoriteButton openButton:(SharedButtonState *)openButton titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(imageUrl:dateState:titleState:textState:favoriteButton:openButton:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedTextState *dateState __attribute__((swift_name("dateState")));
@property (readonly) SharedButtonState *favoriteButton __attribute__((swift_name("favoriteButton")));
@property (readonly) NSString * _Nullable imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) SharedButtonState *openButton __attribute__((swift_name("openButton")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteDetailsState.Companion")))
@interface SharedFavoriteDetailsStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFavoriteDetailsStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedFavoriteDetailsState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteDetailsViewModel")))
@interface SharedFavoriteDetailsViewModel : SharedBaseViewModel<SharedFavoriteDetailsState *, SharedFavoriteDetailsEvents *>
- (instancetype)initWithTitle:(NSString *)title favoritesRepository:(id<SharedFavoritesRepository>)favoritesRepository __attribute__((swift_name("init(title:favoritesRepository:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedFavoriteDetailsState *)initialState __attribute__((swift_name("initialState()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)loadDataWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("loadData(completionHandler:)")));
@property SharedArticle * _Nullable article __attribute__((swift_name("article")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteUiState")))
@interface SharedFavoriteUiState : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title text:(NSString *)text date:(NSString *)date imageUrl:(NSString * _Nullable)imageUrl favorite:(BOOL)favorite cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("init(id:title:text:date:imageUrl:favorite:cellBackground:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedFavoriteUiStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedFavoriteUiState *)doCopyId:(NSString *)id title:(NSString *)title text:(NSString *)text date:(NSString *)date imageUrl:(NSString * _Nullable)imageUrl favorite:(BOOL)favorite cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("doCopy(id:title:text:date:imageUrl:favorite:cellBackground:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *cellBackground __attribute__((swift_name("cellBackground")));
@property (readonly) NSString *date __attribute__((swift_name("date")));
@property (readonly) SharedTextState *dateState __attribute__((swift_name("dateState")));
@property (readonly) BOOL favorite __attribute__((swift_name("favorite")));
@property (readonly) SharedButtonState *favoriteButton __attribute__((swift_name("favoriteButton")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString * _Nullable imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoriteUiState.Companion")))
@interface SharedFavoriteUiStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFavoriteUiStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedFavoriteUiState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((swift_name("FavoritesListEvents")))
@interface SharedFavoritesListEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesListEvents.OnFavoriteClicked")))
@interface SharedFavoritesListEventsOnFavoriteClicked : SharedFavoritesListEvents
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesListEvents.OnItemClicked")))
@interface SharedFavoritesListEventsOnItemClicked : SharedFavoritesListEvents
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesListState")))
@interface SharedFavoritesListState : SharedBase <SharedBaseViewState>
- (instancetype)initWithFavoritesItems:(NSArray<SharedFavoriteUiState *> *)favoritesItems titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("init(favoritesItems:titleBarState:backGroundColor:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedFavoritesListStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedFavoritesListState *)doCopyFavoritesItems:(NSArray<SharedFavoriteUiState *> *)favoritesItems titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("doCopy(favoritesItems:titleBarState:backGroundColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backGroundColor __attribute__((swift_name("backGroundColor")));
@property (readonly) NSArray<SharedFavoriteUiState *> *favoritesItems __attribute__((swift_name("favoritesItems")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesListState.Companion")))
@interface SharedFavoritesListStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFavoritesListStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedFavoritesListState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesListViewModel")))
@interface SharedFavoritesListViewModel : SharedBaseViewModel<SharedFavoritesListState *, SharedFavoritesListEvents *>
- (instancetype)initWithFavoritesRepository:(id<SharedFavoritesRepository>)favoritesRepository __attribute__((swift_name("init(favoritesRepository:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedFavoritesListState *)initialState __attribute__((swift_name("initialState()")));
- (void)onScreenResumed __attribute__((swift_name("onScreenResumed()")));
@property NSMutableArray<SharedArticle *> *favorites __attribute__((swift_name("favorites")));
@end

__attribute__((swift_name("FavoritesRepository")))
@protocol SharedFavoritesRepository
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)checkTitle:(NSString *)title completionHandler:(void (^)(SharedBoolean * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("check(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)deleteTitle:(NSString *)title completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("delete(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getTitle:(NSString *)title completionHandler:(void (^)(SharedArticleDb * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("get(title:completionHandler:)")));
- (NSArray<SharedArticle *> *)getAllFlow __attribute__((swift_name("getAllFlow()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertArticle:(SharedArticle *)article completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(article:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FavoritesRepositoryImpl")))
@interface SharedFavoritesRepositoryImpl : SharedBase <SharedFavoritesRepository>
- (instancetype)initWithDao:(SharedArticleDao *)dao __attribute__((swift_name("init(dao:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)checkTitle:(NSString *)title completionHandler:(void (^)(SharedBoolean * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("check(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)deleteTitle:(NSString *)title completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("delete(title:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getTitle:(NSString *)title completionHandler:(void (^)(SharedArticleDb * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("get(title:completionHandler:)")));
- (NSArray<SharedArticle *> *)getAllFlow __attribute__((swift_name("getAllFlow()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)insertArticle:(SharedArticle *)article completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("insert(article:completionHandler:)")));
@end

__attribute__((swift_name("FridgeMockNetworkService")))
@protocol SharedFridgeMockNetworkService
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getFridgeProductsWithCompletionHandler:(void (^)(NSArray<SharedFridgeProduct *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getFridgeProducts(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecommendedRecipesSelectedProducts:(NSArray<NSString *> *)selectedProducts completionHandler:(void (^)(NSArray<SharedFridgeRecommendedRecipe *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecommendedRecipes(selectedProducts:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeMockNetworkServiceImpl")))
@interface SharedFridgeMockNetworkServiceImpl : SharedBase <SharedFridgeMockNetworkService>
- (instancetype)initWithRecipesService:(id<SharedRecipesService>)recipesService __attribute__((swift_name("init(recipesService:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getFridgeProductsWithCompletionHandler:(void (^)(NSArray<SharedFridgeProduct *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getFridgeProducts(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecommendedRecipesSelectedProducts:(NSArray<NSString *> *)selectedProducts completionHandler:(void (^)(NSArray<SharedFridgeRecommendedRecipe *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecommendedRecipes(selectedProducts:completionHandler:)")));
@end

__attribute__((swift_name("FridgeEvents")))
@interface SharedFridgeEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeEvents.OnProductClicked")))
@interface SharedFridgeEventsOnProductClicked : SharedFridgeEvents
- (instancetype)initWithProductId:(NSString *)productId __attribute__((swift_name("init(productId:)"))) __attribute__((objc_designated_initializer));
- (SharedFridgeEventsOnProductClicked *)doCopyProductId:(NSString *)productId __attribute__((swift_name("doCopy(productId:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *productId __attribute__((swift_name("productId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeEvents.OnRecipeClicked")))
@interface SharedFridgeEventsOnRecipeClicked : SharedFridgeEvents
- (instancetype)initWithRecipeId:(NSString *)recipeId __attribute__((swift_name("init(recipeId:)"))) __attribute__((objc_designated_initializer));
- (SharedFridgeEventsOnRecipeClicked *)doCopyRecipeId:(NSString *)recipeId __attribute__((swift_name("doCopy(recipeId:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *recipeId __attribute__((swift_name("recipeId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeEvents.OnRecommendRecipesClicked")))
@interface SharedFridgeEventsOnRecommendRecipesClicked : SharedFridgeEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onRecommendRecipesClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFridgeEventsOnRecommendRecipesClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeEvents.OnRetryClicked")))
@interface SharedFridgeEventsOnRetryClicked : SharedFridgeEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onRetryClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFridgeEventsOnRetryClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeProductUiState")))
@interface SharedFridgeProductUiState : SharedBase
- (instancetype)initWithId:(NSString *)id name:(NSString *)name isSelected:(BOOL)isSelected __attribute__((swift_name("init(id:name:isSelected:)"))) __attribute__((objc_designated_initializer));
- (SharedFridgeProductUiState *)doCopyId:(NSString *)id name:(NSString *)name isSelected:(BOOL)isSelected __attribute__((swift_name("doCopy(id:name:isSelected:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) BOOL isSelected __attribute__((swift_name("isSelected")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeRecommendedRecipeUiState")))
@interface SharedFridgeRecommendedRecipeUiState : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title description:(NSString *)description duration:(NSString *)duration imageUrl:(NSString *)imageUrl matchedIngredientsText:(NSString *)matchedIngredientsText cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("init(id:title:description:duration:imageUrl:matchedIngredientsText:cellBackground:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedFridgeRecommendedRecipeUiStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedFridgeRecommendedRecipeUiState *)doCopyId:(NSString *)id title:(NSString *)title description:(NSString *)description duration:(NSString *)duration imageUrl:(NSString *)imageUrl matchedIngredientsText:(NSString *)matchedIngredientsText cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("doCopy(id:title:description:duration:imageUrl:matchedIngredientsText:cellBackground:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *cellBackground __attribute__((swift_name("cellBackground")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) SharedTextState *descriptionState __attribute__((swift_name("descriptionState")));
@property (readonly) NSString *duration __attribute__((swift_name("duration")));
@property (readonly) SharedTextState *durationState __attribute__((swift_name("durationState")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSString *matchedIngredientsText __attribute__((swift_name("matchedIngredientsText")));
@property (readonly) SharedTextState *matchedState __attribute__((swift_name("matchedState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeRecommendedRecipeUiState.Companion")))
@interface SharedFridgeRecommendedRecipeUiStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFridgeRecommendedRecipeUiStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedFridgeRecommendedRecipeUiState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeState")))
@interface SharedFridgeState : SharedBase <SharedBaseViewState>
- (instancetype)initWithProductsItems:(NSArray<SharedFridgeProductUiState *> *)productsItems recommendationsItems:(NSArray<SharedFridgeRecommendedRecipeUiState *> *)recommendationsItems productsTitleState:(SharedTextState *)productsTitleState recommendationsTitleState:(SharedTextState *)recommendationsTitleState emptyRecommendationsState:(SharedTextState *)emptyRecommendationsState recommendButtonTitle:(NSString *)recommendButtonTitle isRecommendButtonEnabled:(BOOL)isRecommendButtonEnabled hasRecommendationsRequest:(BOOL)hasRecommendationsRequest titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("init(productsItems:recommendationsItems:productsTitleState:recommendationsTitleState:emptyRecommendationsState:recommendButtonTitle:isRecommendButtonEnabled:hasRecommendationsRequest:titleBarState:backGroundColor:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedFridgeStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedFridgeState *)doCopyProductsItems:(NSArray<SharedFridgeProductUiState *> *)productsItems recommendationsItems:(NSArray<SharedFridgeRecommendedRecipeUiState *> *)recommendationsItems productsTitleState:(SharedTextState *)productsTitleState recommendationsTitleState:(SharedTextState *)recommendationsTitleState emptyRecommendationsState:(SharedTextState *)emptyRecommendationsState recommendButtonTitle:(NSString *)recommendButtonTitle isRecommendButtonEnabled:(BOOL)isRecommendButtonEnabled hasRecommendationsRequest:(BOOL)hasRecommendationsRequest titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("doCopy(productsItems:recommendationsItems:productsTitleState:recommendationsTitleState:emptyRecommendationsState:recommendButtonTitle:isRecommendButtonEnabled:hasRecommendationsRequest:titleBarState:backGroundColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backGroundColor __attribute__((swift_name("backGroundColor")));
@property (readonly) SharedTextState *emptyRecommendationsState __attribute__((swift_name("emptyRecommendationsState")));
@property (readonly) BOOL hasRecommendationsRequest __attribute__((swift_name("hasRecommendationsRequest")));
@property (readonly) BOOL isRecommendButtonEnabled __attribute__((swift_name("isRecommendButtonEnabled")));
@property (readonly) NSArray<SharedFridgeProductUiState *> *productsItems __attribute__((swift_name("productsItems")));
@property (readonly) SharedTextState *productsTitleState __attribute__((swift_name("productsTitleState")));
@property (readonly) NSString *recommendButtonTitle __attribute__((swift_name("recommendButtonTitle")));
@property (readonly) NSArray<SharedFridgeRecommendedRecipeUiState *> *recommendationsItems __attribute__((swift_name("recommendationsItems")));
@property (readonly) SharedTextState *recommendationsTitleState __attribute__((swift_name("recommendationsTitleState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeState.Companion")))
@interface SharedFridgeStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedFridgeStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedFridgeState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeViewModel")))
@interface SharedFridgeViewModel : SharedBaseViewModel<SharedFridgeState *, SharedFridgeEvents *>
- (instancetype)initWithFridgeMockNetworkService:(id<SharedFridgeMockNetworkService>)fridgeMockNetworkService __attribute__((swift_name("init(fridgeMockNetworkService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedFridgeState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeProduct")))
@interface SharedFridgeProduct : SharedBase
- (instancetype)initWithId:(NSString *)id name:(NSString *)name __attribute__((swift_name("init(id:name:)"))) __attribute__((objc_designated_initializer));
- (SharedFridgeProduct *)doCopyId:(NSString *)id name:(NSString *)name __attribute__((swift_name("doCopy(id:name:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FridgeRecommendedRecipe")))
@interface SharedFridgeRecommendedRecipe : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title description:(NSString *)description durationMinutes:(int32_t)durationMinutes imageUrl:(NSString *)imageUrl matchedIngredients:(NSArray<NSString *> *)matchedIngredients __attribute__((swift_name("init(id:title:description:durationMinutes:imageUrl:matchedIngredients:)"))) __attribute__((objc_designated_initializer));
- (SharedFridgeRecommendedRecipe *)doCopyId:(NSString *)id title:(NSString *)title description:(NSString *)description durationMinutes:(int32_t)durationMinutes imageUrl:(NSString *)imageUrl matchedIngredients:(NSArray<NSString *> *)matchedIngredients __attribute__((swift_name("doCopy(id:title:description:durationMinutes:imageUrl:matchedIngredients:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) int32_t durationMinutes __attribute__((swift_name("durationMinutes")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSArray<NSString *> *matchedIngredients __attribute__((swift_name("matchedIngredients")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((swift_name("HomeEvents")))
@interface SharedHomeEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("HomeState")))
@interface SharedHomeState : SharedBase <SharedBaseViewState>
- (instancetype)initWithTabs:(NSArray<NSString *> *)tabs titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(tabs:titleBarState:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedHomeStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedHomeState *)doCopyTabs:(NSArray<NSString *> *)tabs titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(tabs:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<NSString *> *tabs __attribute__((swift_name("tabs")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("HomeState.Companion")))
@interface SharedHomeStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedHomeStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedHomeState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("HomeViewModel")))
@interface SharedHomeViewModel : SharedBaseViewModel<SharedHomeState *, SharedHomeEvents *>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedHomeState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((swift_name("NewsService")))
@protocol SharedNewsService
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getNewsWithCompletionHandler:(void (^)(SharedKtor_client_coreHttpResponse * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getNews(completionHandler:)")));
@property NSMutableArray<SharedArticle *> *news __attribute__((swift_name("news")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsServiceImpl")))
@interface SharedNewsServiceImpl : SharedBase <SharedNewsService>
- (instancetype)initWithClient:(SharedKtor_client_coreHttpClient *)client settings:(SharedNetworkSettings *)settings __attribute__((swift_name("init(client:settings:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getNewsWithCompletionHandler:(void (^)(SharedKtor_client_coreHttpResponse * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getNews(completionHandler:)")));
@property NSMutableArray<SharedArticle *> *news __attribute__((swift_name("news")));
@end

__attribute__((swift_name("NewsDetailsEvents")))
@interface SharedNewsDetailsEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsDetailsEvents.OnFavoriteClicked")))
@interface SharedNewsDetailsEventsOnFavoriteClicked : SharedNewsDetailsEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onFavoriteClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsDetailsEventsOnFavoriteClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsDetailsEvents.OnOpenClicked")))
@interface SharedNewsDetailsEventsOnOpenClicked : SharedNewsDetailsEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onOpenClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsDetailsEventsOnOpenClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsDetailsState")))
@interface SharedNewsDetailsState : SharedBase <SharedBaseViewState>
- (instancetype)initWithImageUrl:(NSString * _Nullable)imageUrl dateState:(SharedTextState *)dateState titleState:(SharedTextState *)titleState textState:(SharedTextState *)textState favoriteButton:(SharedButtonState *)favoriteButton openButton:(SharedButtonState *)openButton titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(imageUrl:dateState:titleState:textState:favoriteButton:openButton:titleBarState:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNewsDetailsStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedNewsDetailsState *)doCopyImageUrl:(NSString * _Nullable)imageUrl dateState:(SharedTextState *)dateState titleState:(SharedTextState *)titleState textState:(SharedTextState *)textState favoriteButton:(SharedButtonState *)favoriteButton openButton:(SharedButtonState *)openButton titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(imageUrl:dateState:titleState:textState:favoriteButton:openButton:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedTextState *dateState __attribute__((swift_name("dateState")));
@property (readonly) SharedButtonState *favoriteButton __attribute__((swift_name("favoriteButton")));
@property (readonly) NSString * _Nullable imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) SharedButtonState *openButton __attribute__((swift_name("openButton")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsDetailsState.Companion")))
@interface SharedNewsDetailsStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsDetailsStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedNewsDetailsState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsDetailsViewModel")))
@interface SharedNewsDetailsViewModel : SharedBaseViewModel<SharedNewsDetailsState *, SharedNewsDetailsEvents *>
- (instancetype)initWithTitle:(NSString *)title newsService:(id<SharedNewsService>)newsService favoritesRepository:(id<SharedFavoritesRepository>)favoritesRepository __attribute__((swift_name("init(title:newsService:favoritesRepository:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedNewsDetailsState *)initialState __attribute__((swift_name("initialState()")));
@property SharedArticle * _Nullable article __attribute__((swift_name("article")));
@end

__attribute__((swift_name("NewsListEvents")))
@interface SharedNewsListEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListEvents.OnFavoriteClicked")))
@interface SharedNewsListEventsOnFavoriteClicked : SharedNewsListEvents
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListEvents.OnItemClicked")))
@interface SharedNewsListEventsOnItemClicked : SharedNewsListEvents
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListEvents.OnSearchQueryChanged")))
@interface SharedNewsListEventsOnSearchQueryChanged : SharedNewsListEvents
- (instancetype)initWithQuery:(NSString *)query __attribute__((swift_name("init(query:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *query __attribute__((swift_name("query")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListState")))
@interface SharedNewsListState : SharedBase <SharedBaseViewState>
- (instancetype)initWithNewsItems:(NSArray<SharedNewsUiState *> *)newsItems searchQuery:(NSString *)searchQuery searchPlaceholder:(NSString *)searchPlaceholder titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("init(newsItems:searchQuery:searchPlaceholder:titleBarState:backGroundColor:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNewsListStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedNewsListState *)doCopyNewsItems:(NSArray<SharedNewsUiState *> *)newsItems searchQuery:(NSString *)searchQuery searchPlaceholder:(NSString *)searchPlaceholder titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("doCopy(newsItems:searchQuery:searchPlaceholder:titleBarState:backGroundColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backGroundColor __attribute__((swift_name("backGroundColor")));
@property (readonly) NSArray<SharedNewsUiState *> *newsItems __attribute__((swift_name("newsItems")));
@property (readonly) NSString *searchPlaceholder __attribute__((swift_name("searchPlaceholder")));
@property (readonly) NSString *searchQuery __attribute__((swift_name("searchQuery")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListState.Companion")))
@interface SharedNewsListStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsListStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedNewsListState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsListViewModel")))
@interface SharedNewsListViewModel : SharedBaseViewModel<SharedNewsListState *, SharedNewsListEvents *>
- (instancetype)initWithNewsService:(id<SharedNewsService>)newsService favoritesRepository:(id<SharedFavoritesRepository>)favoritesRepository __attribute__((swift_name("init(newsService:favoritesRepository:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedNewsListState *)initialState __attribute__((swift_name("initialState()")));
- (void)onScreenResumed __attribute__((swift_name("onScreenResumed()")));
@property NSMutableArray<SharedArticle *> *favorites __attribute__((swift_name("favorites")));
@property NSMutableArray<SharedArticle *> *news __attribute__((swift_name("news")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsUiState")))
@interface SharedNewsUiState : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title text:(NSString *)text date:(NSString *)date imageUrl:(NSString * _Nullable)imageUrl isFavorite:(BOOL)isFavorite cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("init(id:title:text:date:imageUrl:isFavorite:cellBackground:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNewsUiStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedNewsUiState *)doCopyId:(NSString *)id title:(NSString *)title text:(NSString *)text date:(NSString *)date imageUrl:(NSString * _Nullable)imageUrl isFavorite:(BOOL)isFavorite cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("doCopy(id:title:text:date:imageUrl:isFavorite:cellBackground:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *cellBackground __attribute__((swift_name("cellBackground")));
@property (readonly) NSString *date __attribute__((swift_name("date")));
@property (readonly) SharedTextState *dateState __attribute__((swift_name("dateState")));
@property (readonly) SharedButtonState *favoriteButton __attribute__((swift_name("favoriteButton")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString * _Nullable imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) BOOL isFavorite __attribute__((swift_name("isFavorite")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsUiState.Companion")))
@interface SharedNewsUiStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsUiStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedNewsUiState *)getMock __attribute__((swift_name("getMock()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Article")))
@interface SharedArticle : SharedBase
- (instancetype)initWithAuthor:(NSString * _Nullable)author title:(NSString * _Nullable)title description:(NSString * _Nullable)description url:(NSString * _Nullable)url urlToImage:(NSString * _Nullable)urlToImage publishedAt:(NSString * _Nullable)publishedAt content:(NSString * _Nullable)content __attribute__((swift_name("init(author:title:description:url:urlToImage:publishedAt:content:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedArticleCompanion *companion __attribute__((swift_name("companion")));
- (SharedArticle *)doCopyAuthor:(NSString * _Nullable)author title:(NSString * _Nullable)title description:(NSString * _Nullable)description url:(NSString * _Nullable)url urlToImage:(NSString * _Nullable)urlToImage publishedAt:(NSString * _Nullable)publishedAt content:(NSString * _Nullable)content __attribute__((swift_name("doCopy(author:title:description:url:urlToImage:publishedAt:content:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable author __attribute__((swift_name("author")));
@property (readonly) NSString * _Nullable content __attribute__((swift_name("content")));
@property (readonly) NSString * _Nullable description_ __attribute__((swift_name("description_")));
@property (readonly) NSString * _Nullable publishedAt __attribute__((swift_name("publishedAt")));
@property (readonly) NSString * _Nullable title __attribute__((swift_name("title")));
@property (readonly) NSString * _Nullable url __attribute__((swift_name("url")));
@property (readonly) NSString * _Nullable urlToImage __attribute__((swift_name("urlToImage")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Article.Companion")))
@interface SharedArticleCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedArticleCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsList")))
@interface SharedNewsList : SharedBase
- (instancetype)initWithStatus:(NSString * _Nullable)status totalResults:(SharedInt * _Nullable)totalResults articles:(NSArray<SharedArticle *> *)articles __attribute__((swift_name("init(status:totalResults:articles:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNewsListCompanion *companion __attribute__((swift_name("companion")));
- (SharedNewsList *)doCopyStatus:(NSString * _Nullable)status totalResults:(SharedInt * _Nullable)totalResults articles:(NSArray<SharedArticle *> *)articles __attribute__((swift_name("doCopy(status:totalResults:articles:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<SharedArticle *> *articles __attribute__((swift_name("articles")));
@property (readonly) NSString * _Nullable status __attribute__((swift_name("status")));
@property (readonly) SharedInt * _Nullable totalResults __attribute__((swift_name("totalResults")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NewsList.Companion")))
@interface SharedNewsListCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNewsListCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileData")))
@interface SharedProfileData : SharedBase
- (instancetype)initWithFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath __attribute__((swift_name("init(firstName:lastName:gender:birthDate:country:city:email:phone:photoPath:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedProfileDataCompanion *companion __attribute__((swift_name("companion")));
- (SharedProfileData *)doCopyFirstName:(NSString *)firstName lastName:(NSString *)lastName gender:(NSString *)gender birthDate:(NSString *)birthDate country:(NSString *)country city:(NSString *)city email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath __attribute__((swift_name("doCopy(firstName:lastName:gender:birthDate:country:city:email:phone:photoPath:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *birthDate __attribute__((swift_name("birthDate")));
@property (readonly) NSString *city __attribute__((swift_name("city")));
@property (readonly) NSString *country __attribute__((swift_name("country")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) NSString *firstName __attribute__((swift_name("firstName")));
@property (readonly) NSString *gender __attribute__((swift_name("gender")));
@property (readonly) NSString *lastName __attribute__((swift_name("lastName")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@property (readonly) NSString *photoPath __attribute__((swift_name("photoPath")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileData.Companion")))
@interface SharedProfileDataCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedProfileDataCompanion *shared __attribute__((swift_name("shared")));
- (SharedProfileData *)mock __attribute__((swift_name("mock()")));
@end

__attribute__((swift_name("ProfileEffect")))
@interface SharedProfileEffect : SharedBase
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileEffect.ShowImageSourceDialog")))
@interface SharedProfileEffectShowImageSourceDialog : SharedProfileEffect
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)showImageSourceDialog __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedProfileEffectShowImageSourceDialog *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("ProfileEvents")))
@interface SharedProfileEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileEvents.AvatarTapped")))
@interface SharedProfileEventsAvatarTapped : SharedProfileEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)avatarTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedProfileEventsAvatarTapped *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileEvents.LogoutTapped")))
@interface SharedProfileEventsLogoutTapped : SharedProfileEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)logoutTapped __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedProfileEventsLogoutTapped *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileEvents.PhotoChanged")))
@interface SharedProfileEventsPhotoChanged : SharedProfileEvents
- (instancetype)initWithPhotoPath:(NSString *)photoPath __attribute__((swift_name("init(photoPath:)"))) __attribute__((objc_designated_initializer));
- (SharedProfileEventsPhotoChanged *)doCopyPhotoPath:(NSString *)photoPath __attribute__((swift_name("doCopy(photoPath:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *photoPath __attribute__((swift_name("photoPath")));
@end

__attribute__((swift_name("ProfileRepository")))
@protocol SharedProfileRepository
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)clearWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("clear(completionHandler:)")));
- (SharedProfileData *)getProfileOrMock __attribute__((swift_name("getProfileOrMock()")));
- (BOOL)hasSavedProfile __attribute__((swift_name("hasSavedProfile()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)saveProfileData:(SharedProfileData *)data completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("saveProfile(data:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)updatePhotoPhotoPath:(NSString *)photoPath completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("updatePhoto(photoPath:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileRepositoryImpl")))
@interface SharedProfileRepositoryImpl : SharedBase <SharedProfileRepository>
- (instancetype)initWithProfileDao:(SharedProfileDao *)profileDao __attribute__((swift_name("init(profileDao:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)clearWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("clear(completionHandler:)")));
- (SharedProfileData *)getProfileOrMock __attribute__((swift_name("getProfileOrMock()")));
- (BOOL)hasSavedProfile __attribute__((swift_name("hasSavedProfile()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)saveProfileData:(SharedProfileData *)data completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("saveProfile(data:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)updatePhotoPhotoPath:(NSString *)photoPath completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("updatePhoto(photoPath:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileState")))
@interface SharedProfileState : SharedBase <SharedBaseViewState>
- (instancetype)initWithFullName:(NSString *)fullName gender:(NSString *)gender birthDate:(NSString *)birthDate location:(NSString *)location email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath isMockData:(BOOL)isMockData titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(fullName:gender:birthDate:location:email:phone:photoPath:isMockData:titleBarState:)"))) __attribute__((objc_designated_initializer));
- (SharedProfileState *)doCopyFullName:(NSString *)fullName gender:(NSString *)gender birthDate:(NSString *)birthDate location:(NSString *)location email:(NSString *)email phone:(NSString *)phone photoPath:(NSString *)photoPath isMockData:(BOOL)isMockData titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(fullName:gender:birthDate:location:email:phone:photoPath:isMockData:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *birthDate __attribute__((swift_name("birthDate")));
@property (readonly) NSString *email __attribute__((swift_name("email")));
@property (readonly) NSString *fullName __attribute__((swift_name("fullName")));
@property (readonly) NSString *gender __attribute__((swift_name("gender")));
@property (readonly) BOOL isMockData __attribute__((swift_name("isMockData")));
@property (readonly) NSString *location __attribute__((swift_name("location")));
@property (readonly) NSString *phone __attribute__((swift_name("phone")));
@property (readonly) NSString *photoPath __attribute__((swift_name("photoPath")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ProfileViewModel")))
@interface SharedProfileViewModel : SharedBaseViewModel<SharedProfileState *, SharedProfileEvents *>
- (instancetype)initWithProfileRepository:(id<SharedProfileRepository>)profileRepository authService:(id<SharedAuthService>)authService __attribute__((swift_name("init(profileRepository:authService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedProfileState *)initialState __attribute__((swift_name("initialState()")));
@property (readonly) SharedCommonFlow<SharedProfileEffect *> *effectFlow __attribute__((swift_name("effectFlow")));
@end

__attribute__((swift_name("RecipesService")))
@protocol SharedRecipesService
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecipeByIdId:(NSString *)id completionHandler:(void (^)(SharedRecipe * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecipeById(id:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecipesWithCompletionHandler:(void (^)(NSArray<SharedRecipe *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecipes(completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesServiceImpl")))
@interface SharedRecipesServiceImpl : SharedBase <SharedRecipesService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecipeByIdId:(NSString *)id completionHandler:(void (^)(SharedRecipe * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecipeById(id:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)getRecipesWithCompletionHandler:(void (^)(NSArray<SharedRecipe *> * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getRecipes(completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeIngredientUiState")))
@interface SharedRecipeIngredientUiState : SharedBase
- (instancetype)initWithName:(NSString *)name amount:(NSString *)amount __attribute__((swift_name("init(name:amount:)"))) __attribute__((objc_designated_initializer));
- (SharedRecipeIngredientUiState *)doCopyName:(NSString *)name amount:(NSString *)amount __attribute__((swift_name("doCopy(name:amount:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *amount __attribute__((swift_name("amount")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeStepUiState")))
@interface SharedRecipeStepUiState : SharedBase
- (instancetype)initWithNumber:(int32_t)number text:(NSString *)text duration:(NSString *)duration __attribute__((swift_name("init(number:text:duration:)"))) __attribute__((objc_designated_initializer));
- (SharedRecipeStepUiState *)doCopyNumber:(int32_t)number text:(NSString *)text duration:(NSString *)duration __attribute__((swift_name("doCopy(number:text:duration:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *duration __attribute__((swift_name("duration")));
@property (readonly) int32_t number __attribute__((swift_name("number")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@end

__attribute__((swift_name("RecipesDetailsEvents")))
@interface SharedRecipesDetailsEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesDetailsEvents.OnRetryClicked")))
@interface SharedRecipesDetailsEventsOnRetryClicked : SharedRecipesDetailsEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onRetryClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedRecipesDetailsEventsOnRetryClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesDetailsState")))
@interface SharedRecipesDetailsState : SharedBase <SharedBaseViewState>
- (instancetype)initWithImageUrl:(NSString * _Nullable)imageUrl titleState:(SharedTextState *)titleState descriptionState:(SharedTextState *)descriptionState durationState:(SharedTextState *)durationState ingredientsTitleState:(SharedTextState *)ingredientsTitleState ingredientsItems:(NSArray<SharedRecipeIngredientUiState *> *)ingredientsItems ingredientsState:(SharedTextState *)ingredientsState stepsTitleState:(SharedTextState *)stepsTitleState stepsItems:(NSArray<SharedRecipeStepUiState *> *)stepsItems stepsState:(SharedTextState *)stepsState startCookingButtonTitle:(NSString *)startCookingButtonTitle titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("init(imageUrl:titleState:descriptionState:durationState:ingredientsTitleState:ingredientsItems:ingredientsState:stepsTitleState:stepsItems:stepsState:startCookingButtonTitle:titleBarState:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedRecipesDetailsStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedRecipesDetailsState *)doCopyImageUrl:(NSString * _Nullable)imageUrl titleState:(SharedTextState *)titleState descriptionState:(SharedTextState *)descriptionState durationState:(SharedTextState *)durationState ingredientsTitleState:(SharedTextState *)ingredientsTitleState ingredientsItems:(NSArray<SharedRecipeIngredientUiState *> *)ingredientsItems ingredientsState:(SharedTextState *)ingredientsState stepsTitleState:(SharedTextState *)stepsTitleState stepsItems:(NSArray<SharedRecipeStepUiState *> *)stepsItems stepsState:(SharedTextState *)stepsState startCookingButtonTitle:(NSString *)startCookingButtonTitle titleBarState:(SharedTitleBarState *)titleBarState __attribute__((swift_name("doCopy(imageUrl:titleState:descriptionState:durationState:ingredientsTitleState:ingredientsItems:ingredientsState:stepsTitleState:stepsItems:stepsState:startCookingButtonTitle:titleBarState:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedTextState *descriptionState __attribute__((swift_name("descriptionState")));
@property (readonly) SharedTextState *durationState __attribute__((swift_name("durationState")));
@property (readonly) NSString * _Nullable imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSArray<SharedRecipeIngredientUiState *> *ingredientsItems __attribute__((swift_name("ingredientsItems")));
@property (readonly) SharedTextState *ingredientsState __attribute__((swift_name("ingredientsState")));
@property (readonly) SharedTextState *ingredientsTitleState __attribute__((swift_name("ingredientsTitleState")));
@property (readonly) NSString *startCookingButtonTitle __attribute__((swift_name("startCookingButtonTitle")));
@property (readonly) NSArray<SharedRecipeStepUiState *> *stepsItems __attribute__((swift_name("stepsItems")));
@property (readonly) SharedTextState *stepsState __attribute__((swift_name("stepsState")));
@property (readonly) SharedTextState *stepsTitleState __attribute__((swift_name("stepsTitleState")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesDetailsState.Companion")))
@interface SharedRecipesDetailsStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedRecipesDetailsStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedRecipesDetailsState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesDetailsViewModel")))
@interface SharedRecipesDetailsViewModel : SharedBaseViewModel<SharedRecipesDetailsState *, SharedRecipesDetailsEvents *>
- (instancetype)initWithRecipeId:(NSString *)recipeId recipesService:(id<SharedRecipesService>)recipesService __attribute__((swift_name("init(recipeId:recipesService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedRecipesDetailsState *)initialState __attribute__((swift_name("initialState()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeUiState")))
@interface SharedRecipeUiState : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title text:(NSString *)text duration:(NSString *)duration imageUrl:(NSString *)imageUrl cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("init(id:title:text:duration:imageUrl:cellBackground:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedRecipeUiStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedRecipeUiState *)doCopyId:(NSString *)id title:(NSString *)title text:(NSString *)text duration:(NSString *)duration imageUrl:(NSString *)imageUrl cellBackground:(SharedColorResource *)cellBackground __attribute__((swift_name("doCopy(id:title:text:duration:imageUrl:cellBackground:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *cellBackground __attribute__((swift_name("cellBackground")));
@property (readonly) NSString *duration __attribute__((swift_name("duration")));
@property (readonly) SharedTextState *durationState __attribute__((swift_name("durationState")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) SharedTextState *textState __attribute__((swift_name("textState")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@property (readonly) SharedTextState *titleState __attribute__((swift_name("titleState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeUiState.Companion")))
@interface SharedRecipeUiStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedRecipeUiStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedRecipeUiState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((swift_name("RecipesListEvents")))
@interface SharedRecipesListEvents : SharedBase <SharedBaseEvent>
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesListEvents.OnItemClicked")))
@interface SharedRecipesListEventsOnItemClicked : SharedRecipesListEvents
- (instancetype)initWithRecipeId:(NSString *)recipeId __attribute__((swift_name("init(recipeId:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSString *recipeId __attribute__((swift_name("recipeId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesListEvents.OnRetryClicked")))
@interface SharedRecipesListEventsOnRetryClicked : SharedRecipesListEvents
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)onRetryClicked __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedRecipesListEventsOnRetryClicked *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesListState")))
@interface SharedRecipesListState : SharedBase <SharedBaseViewState>
- (instancetype)initWithRecipesItems:(NSArray<SharedRecipeUiState *> *)recipesItems titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("init(recipesItems:titleBarState:backGroundColor:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedRecipesListStateCompanion *companion __attribute__((swift_name("companion")));
- (SharedRecipesListState *)doCopyRecipesItems:(NSArray<SharedRecipeUiState *> *)recipesItems titleBarState:(SharedTitleBarState *)titleBarState backGroundColor:(SharedColorResource *)backGroundColor __attribute__((swift_name("doCopy(recipesItems:titleBarState:backGroundColor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedColorResource *backGroundColor __attribute__((swift_name("backGroundColor")));
@property (readonly) NSArray<SharedRecipeUiState *> *recipesItems __attribute__((swift_name("recipesItems")));
@property (readonly) SharedTitleBarState *titleBarState __attribute__((swift_name("titleBarState")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesListState.Companion")))
@interface SharedRecipesListStateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedRecipesListStateCompanion *shared __attribute__((swift_name("shared")));
- (SharedRecipesListState *)getMock __attribute__((swift_name("getMock()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipesListViewModel")))
@interface SharedRecipesListViewModel : SharedBaseViewModel<SharedRecipesListState *, SharedRecipesListEvents *>
- (instancetype)initWithRecipesService:(id<SharedRecipesService>)recipesService __attribute__((swift_name("init(recipesService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)doInitScreenData __attribute__((swift_name("doInitScreenData()")));
- (void)doInitToolbar __attribute__((swift_name("doInitToolbar()")));
- (SharedRecipesListState *)initialState __attribute__((swift_name("initialState()")));
- (void)onScreenResumed __attribute__((swift_name("onScreenResumed()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Recipe")))
@interface SharedRecipe : SharedBase
- (instancetype)initWithId:(NSString *)id title:(NSString *)title description:(NSString *)description durationMinutes:(int32_t)durationMinutes imageUrl:(NSString *)imageUrl ingredients:(NSArray<SharedRecipeIngredient *> *)ingredients steps:(NSArray<SharedRecipeStep *> *)steps __attribute__((swift_name("init(id:title:description:durationMinutes:imageUrl:ingredients:steps:)"))) __attribute__((objc_designated_initializer));
- (SharedRecipe *)doCopyId:(NSString *)id title:(NSString *)title description:(NSString *)description durationMinutes:(int32_t)durationMinutes imageUrl:(NSString *)imageUrl ingredients:(NSArray<SharedRecipeIngredient *> *)ingredients steps:(NSArray<SharedRecipeStep *> *)steps __attribute__((swift_name("doCopy(id:title:description:durationMinutes:imageUrl:ingredients:steps:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) int32_t durationMinutes __attribute__((swift_name("durationMinutes")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *imageUrl __attribute__((swift_name("imageUrl")));
@property (readonly) NSArray<SharedRecipeIngredient *> *ingredients __attribute__((swift_name("ingredients")));
@property (readonly) NSArray<SharedRecipeStep *> *steps __attribute__((swift_name("steps")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeIngredient")))
@interface SharedRecipeIngredient : SharedBase
- (instancetype)initWithName:(NSString *)name amount:(NSString *)amount __attribute__((swift_name("init(name:amount:)"))) __attribute__((objc_designated_initializer));
- (SharedRecipeIngredient *)doCopyName:(NSString *)name amount:(NSString *)amount __attribute__((swift_name("doCopy(name:amount:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *amount __attribute__((swift_name("amount")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RecipeStep")))
@interface SharedRecipeStep : SharedBase
- (instancetype)initWithText:(NSString *)text durationMinutes:(SharedInt * _Nullable)durationMinutes __attribute__((swift_name("init(text:durationMinutes:)"))) __attribute__((objc_designated_initializer));
- (SharedRecipeStep *)doCopyText:(NSString *)text durationMinutes:(SharedInt * _Nullable)durationMinutes __attribute__((swift_name("doCopy(text:durationMinutes:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedInt * _Nullable durationMinutes __attribute__((swift_name("durationMinutes")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((swift_name("NavigationAction")))
@interface SharedNavigationAction : SharedBase
@property (class, readonly, getter=companion) SharedNavigationActionCompanion *companion __attribute__((swift_name("companion")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.Companion")))
@interface SharedNavigationActionCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateBack")))
@interface SharedNavigationActionNavigateBack : SharedNavigationAction
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)navigateBack __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateBack *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToFavoritesDetails")))
@interface SharedNavigationActionNavigateToFavoritesDetails : SharedNavigationAction
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNavigationActionNavigateToFavoritesDetailsCompanion *companion __attribute__((swift_name("companion")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToFavoritesDetailsCompanion")))
@interface SharedNavigationActionNavigateToFavoritesDetailsCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToFavoritesDetailsCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToLogin")))
@interface SharedNavigationActionNavigateToLogin : SharedNavigationAction
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)navigateToLogin __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToLogin *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToMain")))
@interface SharedNavigationActionNavigateToMain : SharedNavigationAction
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)navigateToMain __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToMain *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToNewsDetails")))
@interface SharedNavigationActionNavigateToNewsDetails : SharedNavigationAction
- (instancetype)initWithTitle:(NSString *)title __attribute__((swift_name("init(title:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNavigationActionNavigateToNewsDetailsCompanion *companion __attribute__((swift_name("companion")));
@property (readonly) NSString *title __attribute__((swift_name("title")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToNewsDetailsCompanion")))
@interface SharedNavigationActionNavigateToNewsDetailsCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToNewsDetailsCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToPin")))
@interface SharedNavigationActionNavigateToPin : SharedNavigationAction
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)navigateToPin __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToPin *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToRecipesDetails")))
@interface SharedNavigationActionNavigateToRecipesDetails : SharedNavigationAction
- (instancetype)initWithRecipeId:(NSString *)recipeId __attribute__((swift_name("init(recipeId:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedNavigationActionNavigateToRecipesDetailsCompanion *companion __attribute__((swift_name("companion")));
@property (readonly) NSString *recipeId __attribute__((swift_name("recipeId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToRecipesDetailsCompanion")))
@interface SharedNavigationActionNavigateToRecipesDetailsCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToRecipesDetailsCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationAction.NavigateToSignUp")))
@interface SharedNavigationActionNavigateToSignUp : SharedNavigationAction
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)navigateToSignUp __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedNavigationActionNavigateToSignUp *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializerTypeParamsSerializers:(SharedKotlinArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeParamsSerializers __attribute__((swift_name("serializer(typeParamsSerializers:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("NavigationService")))
@protocol SharedNavigationService
@required
- (void)clearCurrentBackStackEntryKey:(NSString *)key __attribute__((swift_name("clearCurrentBackStackEntry(key:)")));
- (id _Nullable)getCurrentBackStackEntryKey:(NSString *)key __attribute__((swift_name("getCurrentBackStackEntry(key:)")));
- (void)navigateAction:(SharedNavigationAction *)action __attribute__((swift_name("navigate(action:)")));
- (void)navigateBack __attribute__((swift_name("navigateBack()")));
- (void)setPreviousBackStackEntryKey:(NSString *)key value:(id _Nullable)value __attribute__((swift_name("setPreviousBackStackEntry(key:value:)")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> currentDestination __attribute__((swift_name("currentDestination")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NavigationServiceImpl")))
@interface SharedNavigationServiceImpl : SharedBase <SharedNavigationService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)clearCurrentBackStackEntryKey:(NSString *)key __attribute__((swift_name("clearCurrentBackStackEntry(key:)")));
- (id _Nullable)getCurrentBackStackEntryKey:(NSString *)key __attribute__((swift_name("getCurrentBackStackEntry(key:)")));
- (void)navigateAction:(SharedNavigationAction *)action __attribute__((swift_name("navigate(action:)")));
- (void)navigateBack __attribute__((swift_name("navigateBack()")));
- (void)setPreviousBackStackEntryKey:(NSString *)key value:(id _Nullable)value __attribute__((swift_name("setPreviousBackStackEntry(key:value:)")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> currentDestination __attribute__((swift_name("currentDestination")));
@property (readonly) SharedCommonFlow<SharedNavigationAction *> *navigationFlow __attribute__((swift_name("navigationFlow")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreSerializationStrategy")))
@protocol SharedKotlinx_serialization_coreSerializationStrategy
@required
- (void)serializeEncoder:(id<SharedKotlinx_serialization_coreEncoder>)encoder value:(id _Nullable)value __attribute__((swift_name("serialize(encoder:value:)")));
@property (readonly) id<SharedKotlinx_serialization_coreSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreDeserializationStrategy")))
@protocol SharedKotlinx_serialization_coreDeserializationStrategy
@required
- (id _Nullable)deserializeDecoder:(id<SharedKotlinx_serialization_coreDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
@property (readonly) id<SharedKotlinx_serialization_coreSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreKSerializer")))
@protocol SharedKotlinx_serialization_coreKSerializer <SharedKotlinx_serialization_coreSerializationStrategy, SharedKotlinx_serialization_coreDeserializationStrategy>
@required
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DateSerializer")))
@interface SharedDateSerializer : SharedBase <SharedKotlinx_serialization_coreKSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)dateSerializer __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDateSerializer *shared __attribute__((swift_name("shared")));
- (SharedKotlinx_datetimeLocalDate *)deserializeDecoder:(id<SharedKotlinx_serialization_coreDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (void)serializeEncoder:(id<SharedKotlinx_serialization_coreEncoder>)encoder value:(SharedKotlinx_datetimeLocalDate *)value __attribute__((swift_name("serialize(encoder:value:)")));
@property (readonly) id<SharedKotlinx_serialization_coreSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DateTimeSerializer")))
@interface SharedDateTimeSerializer : SharedBase <SharedKotlinx_serialization_coreKSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)dateTimeSerializer __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedDateTimeSerializer *shared __attribute__((swift_name("shared")));
- (SharedKotlinx_datetimeLocalDateTime *)deserializeDecoder:(id<SharedKotlinx_serialization_coreDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (void)serializeEncoder:(id<SharedKotlinx_serialization_coreEncoder>)encoder value:(SharedKotlinx_datetimeLocalDateTime *)value __attribute__((swift_name("serialize(encoder:value:)")));
@property (readonly) id<SharedKotlinx_serialization_coreSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NetworkSettings")))
@interface SharedNetworkSettings : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (readonly) NSString *apiKey __attribute__((swift_name("apiKey")));
@property (readonly) NSString *newsApiUrl __attribute__((swift_name("newsApiUrl")));
@property (readonly) NSString *serverUrl __attribute__((swift_name("serverUrl")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreFlow")))
@protocol SharedKotlinx_coroutines_coreFlow
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)collectCollector:(id<SharedKotlinx_coroutines_coreFlowCollector>)collector completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("collect(collector:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CommonFlow")))
@interface SharedCommonFlow<T> : SharedBase <SharedKotlinx_coroutines_coreFlow>
- (instancetype)initWithOrigin:(id<SharedKotlinx_coroutines_coreFlow>)origin __attribute__((swift_name("init(origin:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)collectCollector:(id<SharedKotlinx_coroutines_coreFlowCollector>)collector completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("collect(collector:completionHandler:)")));
- (id<SharedKtor_ioCloseable>)watchBlock:(void (^)(T _Nullable))block __attribute__((swift_name("watch(block:)")));
- (id<SharedKtor_ioCloseable>)watchSingleBlock:(void (^)(T _Nullable))block __attribute__((swift_name("watchSingle(block:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Color")))
@interface SharedColor : SharedBase
- (instancetype)initWithColorRGBA:(int64_t)colorRGBA __attribute__((swift_name("init(colorRGBA:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithRed:(int32_t)red green:(int32_t)green blue:(int32_t)blue alpha:(int32_t)alpha __attribute__((swift_name("init(red:green:blue:alpha:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedColorCompanion *companion __attribute__((swift_name("companion")));
- (SharedColor *)doCopyRed:(int32_t)red green:(int32_t)green blue:(int32_t)blue alpha:(int32_t)alpha __attribute__((swift_name("doCopy(red:green:blue:alpha:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t alpha __attribute__((swift_name("alpha")));
@property (readonly) int64_t argb __attribute__((swift_name("argb")));
@property (readonly) int32_t blue __attribute__((swift_name("blue")));
@property (readonly) int32_t green __attribute__((swift_name("green")));
@property (readonly) int32_t red __attribute__((swift_name("red")));
@property (readonly) int64_t rgba __attribute__((swift_name("rgba")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Color.Companion")))
@interface SharedColorCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedColorCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("FileResource")))
@interface SharedFileResource : SharedBase
- (instancetype)initWithFileName:(NSString *)fileName extension:(NSString *)extension bundle:(NSBundle *)bundle __attribute__((swift_name("init(fileName:extension:bundle:)"))) __attribute__((objc_designated_initializer));
- (NSString *)readText __attribute__((swift_name("readText()")));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@property (readonly) NSString *extension __attribute__((swift_name("extension")));
@property (readonly) NSString *fileName __attribute__((swift_name("fileName")));
@property (readonly) NSString *path __attribute__((swift_name("path")));
@property (readonly) NSURL *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AssetResource")))
@interface SharedAssetResource : SharedFileResource
- (instancetype)initWithOriginalPath:(NSString *)originalPath fileName:(NSString *)fileName extension:(NSString *)extension bundle:(NSBundle *)bundle __attribute__((swift_name("init(originalPath:fileName:extension:bundle:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithFileName:(NSString *)fileName extension:(NSString *)extension bundle:(NSBundle *)bundle __attribute__((swift_name("init(fileName:extension:bundle:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
@property (readonly) NSString *originalPath __attribute__((swift_name("originalPath")));
@property (readonly) NSString *path __attribute__((swift_name("path")));
@property (readonly) NSURL *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorResource")))
@interface SharedColorResource : SharedBase
- (instancetype)initWithName:(NSString *)name bundle:(NSBundle *)bundle __attribute__((swift_name("init(name:bundle:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FontResource")))
@interface SharedFontResource : SharedBase
- (instancetype)initWithFontName:(NSString *)fontName bundle:(NSBundle *)bundle __attribute__((swift_name("init(fontName:bundle:)"))) __attribute__((objc_designated_initializer));

/**
 * @note This method converts instances of ObjCErrorException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (BOOL)registerFontAndReturnError:(NSError * _Nullable * _Nullable)error __attribute__((swift_name("registerFont()")));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@property (readonly) NSData *data __attribute__((swift_name("data")));
@property (readonly) NSString *filePath __attribute__((swift_name("filePath")));
@property (readonly) NSString *fontName __attribute__((swift_name("fontName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ImageResource")))
@interface SharedImageResource : SharedBase
- (instancetype)initWithAssetImageName:(NSString *)assetImageName bundle:(NSBundle *)bundle __attribute__((swift_name("init(assetImageName:bundle:)"))) __attribute__((objc_designated_initializer));
- (SharedImageResource *)doCopyAssetImageName:(NSString *)assetImageName bundle:(NSBundle *)bundle __attribute__((swift_name("doCopy(assetImageName:bundle:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
- (UIImage * _Nullable)toUIImage __attribute__((swift_name("toUIImage()")));
@property (readonly) NSString *assetImageName __attribute__((swift_name("assetImageName")));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PluralsResource")))
@interface SharedPluralsResource : SharedBase
- (instancetype)initWithResourceId:(NSString *)resourceId bundle:(NSBundle *)bundle __attribute__((swift_name("init(resourceId:bundle:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@property (readonly) NSString *resourceId __attribute__((swift_name("resourceId")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ReadFileTextException")))
@interface SharedReadFileTextException : SharedKotlinException
- (instancetype)initWithFileResource:(SharedFileResource *)fileResource info:(NSString *)info __attribute__((swift_name("init(fileResource:info:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithFileResource:(SharedFileResource *)fileResource error:(NSError *)error __attribute__((swift_name("init(fileResource:error:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (readonly) SharedFileResource *fileResource __attribute__((swift_name("fileResource")));
@property (readonly) NSString *info __attribute__((swift_name("info")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ResourcePlatformDetails")))
@interface SharedResourcePlatformDetails : SharedBase
- (instancetype)initWithNsBundle:(NSBundle *)nsBundle __attribute__((swift_name("init(nsBundle:)"))) __attribute__((objc_designated_initializer));
@property (readonly) NSBundle *nsBundle __attribute__((swift_name("nsBundle")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringResource")))
@interface SharedStringResource : SharedBase
- (instancetype)initWithResourceId:(NSString *)resourceId bundle:(NSBundle *)bundle __attribute__((swift_name("init(resourceId:bundle:)"))) __attribute__((objc_designated_initializer));
- (SharedStringResource *)doCopyResourceId:(NSString *)resourceId bundle:(NSBundle *)bundle __attribute__((swift_name("doCopy(resourceId:bundle:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSBundle *bundle __attribute__((swift_name("bundle")));
@property (readonly) NSString *resourceId __attribute__((swift_name("resourceId")));
@end

__attribute__((swift_name("StringDesc")))
@protocol SharedStringDesc
@required
- (NSString *)localized __attribute__((swift_name("localized()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("CompositionStringDesc")))
@interface SharedCompositionStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithArgs:(id)args separator:(NSString * _Nullable)separator __attribute__((swift_name("init(args:separator:)"))) __attribute__((objc_designated_initializer));
- (SharedCompositionStringDesc *)doCopyArgs:(id)args separator:(NSString * _Nullable)separator __attribute__((swift_name("doCopy(args:separator:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id args __attribute__((swift_name("args")));
@property (readonly) NSString * _Nullable separator __attribute__((swift_name("separator")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PluralFormattedStringDesc")))
@interface SharedPluralFormattedStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number args:(NSArray<id> *)args __attribute__((swift_name("init(pluralsRes:number:args:)"))) __attribute__((objc_designated_initializer));
- (SharedPluralFormattedStringDesc *)doCopyPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number args:(NSArray<id> *)args __attribute__((swift_name("doCopy(pluralsRes:number:args:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<id> *args __attribute__((swift_name("args")));
@property (readonly) int32_t number __attribute__((swift_name("number")));
@property (readonly) SharedPluralsResource *pluralsRes __attribute__((swift_name("pluralsRes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PluralStringDesc")))
@interface SharedPluralStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number __attribute__((swift_name("init(pluralsRes:number:)"))) __attribute__((objc_designated_initializer));
- (SharedPluralStringDesc *)doCopyPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number __attribute__((swift_name("doCopy(pluralsRes:number:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t number __attribute__((swift_name("number")));
@property (readonly) SharedPluralsResource *pluralsRes __attribute__((swift_name("pluralsRes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RawStringDesc")))
@interface SharedRawStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithString:(NSString *)string __attribute__((swift_name("init(string:)"))) __attribute__((objc_designated_initializer));
- (SharedRawStringDesc *)doCopyString:(NSString *)string __attribute__((swift_name("doCopy(string:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *string __attribute__((swift_name("string")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ResourceFormattedStringDesc")))
@interface SharedResourceFormattedStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithStringRes:(SharedStringResource *)stringRes args:(NSArray<id> *)args __attribute__((swift_name("init(stringRes:args:)"))) __attribute__((objc_designated_initializer));
- (SharedResourceFormattedStringDesc *)doCopyStringRes:(SharedStringResource *)stringRes args:(NSArray<id> *)args __attribute__((swift_name("doCopy(stringRes:args:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSArray<id> *args __attribute__((swift_name("args")));
@property (readonly) SharedStringResource *stringRes __attribute__((swift_name("stringRes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ResourceStringDesc")))
@interface SharedResourceStringDesc : SharedBase <SharedStringDesc>
- (instancetype)initWithStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("init(stringRes:)"))) __attribute__((objc_designated_initializer));
- (SharedResourceStringDesc *)doCopyStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("doCopy(stringRes:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)localized __attribute__((swift_name("localized()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedStringResource *stringRes __attribute__((swift_name("stringRes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringDescCompanion")))
@interface SharedStringDescCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStringDescCompanion *shared __attribute__((swift_name("shared")));
@property SharedStringDescLocaleType *localeType __attribute__((swift_name("localeType")));
@end

__attribute__((swift_name("StringDescLocaleType")))
@interface SharedStringDescLocaleType : SharedBase
- (NSBundle *)getLocaleBundleRootBundle:(NSBundle *)rootBundle __attribute__((swift_name("getLocaleBundle(rootBundle:)")));
@property (readonly) NSLocale *locale __attribute__((swift_name("locale")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringDescLocaleType.Custom")))
@interface SharedStringDescLocaleTypeCustom : SharedStringDescLocaleType
- (instancetype)initWithLocale:(NSString *)locale __attribute__((swift_name("init(locale:)"))) __attribute__((objc_designated_initializer));
- (NSBundle *)getLocaleBundleRootBundle:(NSBundle *)rootBundle __attribute__((swift_name("getLocaleBundle(rootBundle:)")));
@property (readonly) NSLocale *locale __attribute__((swift_name("locale")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringDescLocaleType.System")))
@interface SharedStringDescLocaleTypeSystem : SharedStringDescLocaleType
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)system __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedStringDescLocaleTypeSystem *shared __attribute__((swift_name("shared")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSBundle *)getLocaleBundleRootBundle:(NSBundle *)rootBundle __attribute__((swift_name("getLocaleBundle(rootBundle:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSLocale *locale __attribute__((swift_name("locale")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Utils")))
@interface SharedUtils : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)utils __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedUtils *shared __attribute__((swift_name("shared")));
- (NSString *)localizedStringStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("localizedString(stringRes:)")));
- (SharedKotlinArray<id> *)processArgsArgs:(NSArray<id> *)args __attribute__((swift_name("processArgs(args:)")));
- (NSString *)stringWithFormatFormat:(NSString *)format args:(SharedKotlinArray<id> *)args __attribute__((swift_name("stringWithFormat(format:args:)")));
@property (readonly) NSString *BASE_LOCALIZATION __attribute__((swift_name("BASE_LOCALIZATION")));
@end

__attribute__((swift_name("ColorDesc")))
@protocol SharedColorDesc
@required
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorDescCompanion")))
@interface SharedColorDescCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedColorDescCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorDescResource")))
@interface SharedColorDescResource : SharedBase <SharedColorDesc>
- (instancetype)initWithResource:(SharedColorResource *)resource __attribute__((swift_name("init(resource:)"))) __attribute__((objc_designated_initializer));
@property (readonly) SharedColorResource *resource __attribute__((swift_name("resource")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorDescSingle")))
@interface SharedColorDescSingle : SharedBase <SharedColorDesc>
- (instancetype)initWithColor:(SharedColor *)color __attribute__((swift_name("init(color:)"))) __attribute__((objc_designated_initializer));
@property (readonly) SharedColor *color __attribute__((swift_name("color")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorDescThemed")))
@interface SharedColorDescThemed : SharedBase <SharedColorDesc>
- (instancetype)initWithLightColor:(SharedColor *)lightColor darkColor:(SharedColor *)darkColor __attribute__((swift_name("init(lightColor:darkColor:)"))) __attribute__((objc_designated_initializer));
@property (readonly) SharedColor *darkColor __attribute__((swift_name("darkColor")));
@property (readonly) SharedColor *lightColor __attribute__((swift_name("lightColor")));
@end

__attribute__((swift_name("ImageDesc")))
@protocol SharedImageDesc
@required
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ImageDescCompanion")))
@interface SharedImageDescCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedImageDescCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ImageDescResource")))
@interface SharedImageDescResource : SharedBase <SharedImageDesc>
- (instancetype)initWithResource:(SharedImageResource *)resource __attribute__((swift_name("init(resource:)"))) __attribute__((objc_designated_initializer));
- (SharedImageDescResource *)doCopyResource:(SharedImageResource *)resource __attribute__((swift_name("doCopy(resource:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedImageResource *resource __attribute__((swift_name("resource")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ImageDescUrl")))
@interface SharedImageDescUrl : SharedBase <SharedImageDesc>
- (instancetype)initWithUrl:(NSString *)url __attribute__((swift_name("init(url:)"))) __attribute__((objc_designated_initializer));
- (SharedImageDescUrl *)doCopyUrl:(NSString *)url __attribute__((swift_name("doCopy(url:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *url __attribute__((swift_name("url")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ApiError")))
@interface SharedApiError : SharedBase
- (instancetype)initWithStatus:(SharedInt * _Nullable)status name:(NSString * _Nullable)name message:(NSString * _Nullable)message __attribute__((swift_name("init(status:name:message:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedApiErrorCompanion *companion __attribute__((swift_name("companion")));
- (SharedApiError *)doCopyStatus:(SharedInt * _Nullable)status name:(NSString * _Nullable)name message:(NSString * _Nullable)message __attribute__((swift_name("doCopy(status:name:message:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
@property (readonly) NSString * _Nullable name __attribute__((swift_name("name")));
@property (readonly) SharedInt * _Nullable status __attribute__((swift_name("status")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ApiError.Companion")))
@interface SharedApiErrorCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedApiErrorCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ApiErrorWrapper")))
@interface SharedApiErrorWrapper : SharedBase
- (instancetype)initWithError:(SharedApiError * _Nullable)error __attribute__((swift_name("init(error:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedApiErrorWrapperCompanion *companion __attribute__((swift_name("companion")));
- (SharedApiErrorWrapper *)doCopyError:(SharedApiError * _Nullable)error __attribute__((swift_name("doCopy(error:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedApiError * _Nullable error __attribute__((swift_name("error")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ApiErrorWrapper.Companion")))
@interface SharedApiErrorWrapperCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedApiErrorWrapperCompanion *shared __attribute__((swift_name("shared")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end

@interface SharedButtonState (Extensions)
- (SharedButtonState *)getMockValue:(NSString *)value __attribute__((swift_name("getMock(value:)")));
- (SharedButtonState *)updateEnabledEnabled:(BOOL)enabled __attribute__((swift_name("updateEnabled(enabled:)")));
- (SharedButtonState *)updateImageImage:(SharedImageResource *)image __attribute__((swift_name("updateImage(image:)")));
- (SharedButtonState *)updateValueValue:(NSString *)value __attribute__((swift_name("updateValue(value:)")));
@end

@interface SharedDropdownFieldState (Extensions)
- (SharedDropdownFieldState *)updateEnabledEnabled:(BOOL)enabled __attribute__((swift_name("updateEnabled(enabled:)")));
- (SharedDropdownFieldState *)updateValueValue:(NSString *)value __attribute__((swift_name("updateValue(value:)")));
@end

@interface SharedTextFieldState (Extensions)
- (SharedTextFieldState *)updateEnabledEnabled:(BOOL)enabled __attribute__((swift_name("updateEnabled(enabled:)")));
- (SharedTextFieldState *)updateErrorError:(NSString * _Nullable)error __attribute__((swift_name("updateError(error:)")));
- (SharedTextFieldState *)updateValueValue:(NSString *)value __attribute__((swift_name("updateValue(value:)")));
@end

@interface SharedTextFontState (Extensions)
@property (readonly) UIFont *uiFont __attribute__((swift_name("uiFont")));
@end

@interface SharedTextState (Extensions)
- (SharedTextState *)getMockText:(NSString *)text __attribute__((swift_name("getMock(text:)")));
- (SharedTextState *)updateIconEndIcon:(SharedImageResource * _Nullable)icon __attribute__((swift_name("updateIconEnd(icon:)")));
- (SharedTextState *)updateIconStartIcon:(SharedImageResource * _Nullable)icon __attribute__((swift_name("updateIconStart(icon:)")));
- (SharedTextState *)updateValueValue:(NSString *)value __attribute__((swift_name("updateValue(value:)")));
@end

@interface SharedArticleDb (Extensions)
- (SharedArticle *)toEntity __attribute__((swift_name("toEntity()")));
@end

@interface SharedArticle (Extensions)
- (SharedArticleDb *)toDb __attribute__((swift_name("toDb()")));
@end

@interface SharedColor (Extensions)
- (id<SharedColorDesc>)asColorDesc __attribute__((swift_name("asColorDesc()")));
- (UIColor *)toUIColor __attribute__((swift_name("toUIColor()")));
@end

@interface SharedColorCompanion (Extensions)
- (SharedColor *)parseColorColorHEX:(NSString *)colorHEX __attribute__((swift_name("parseColor(colorHEX:)")));
@end

@interface SharedColorResource (Extensions)
- (id<SharedColorDesc>)asColorDesc __attribute__((swift_name("asColorDesc()")));
- (UIColor *)getUIColor __attribute__((swift_name("getUIColor()")));
@property (readonly) UIColor *uiColor __attribute__((swift_name("uiColor")));
@end

@interface SharedFontResource (Extensions)
- (UIFont *)uiFontWithSize:(double)withSize __attribute__((swift_name("uiFont(withSize:)")));
@end

@interface SharedImageResource (Extensions)
- (id<SharedImageDesc>)asImageDesc __attribute__((swift_name("asImageDesc()")));
@property (readonly) UIImage *uiImage __attribute__((swift_name("uiImage")));
@end

@interface SharedPluralsResource (Extensions)
- (SharedPluralStringDesc *)descNumber:(int32_t)number __attribute__((swift_name("desc(number:)")));
- (SharedPluralFormattedStringDesc *)formatNumber:(int32_t)number args:(SharedKotlinArray<id> *)args __attribute__((swift_name("format(number:args:)")));
- (SharedPluralFormattedStringDesc *)formatNumber:(int32_t)number args_:(NSArray<id> *)args __attribute__((swift_name("format(number:args_:)")));
@end

@interface SharedStringResource (Extensions)
- (SharedResourceStringDesc *)desc __attribute__((swift_name("desc()")));
- (SharedResourceFormattedStringDesc *)formatArgs:(SharedKotlinArray<id> *)args __attribute__((swift_name("format(args:)")));
- (SharedResourceFormattedStringDesc *)formatArgs_:(NSArray<id> *)args __attribute__((swift_name("format(args_:)")));
@end

@interface SharedStringDescCompanion (Extensions)
- (SharedCompositionStringDesc *)CompositionArgs:(id)args separator:(NSString * _Nullable)separator __attribute__((swift_name("Composition(args:separator:)")));
- (SharedPluralStringDesc *)PluralPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number __attribute__((swift_name("Plural(pluralsRes:number:)")));
- (SharedPluralFormattedStringDesc *)PluralFormattedPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number args:(SharedKotlinArray<id> *)args __attribute__((swift_name("PluralFormatted(pluralsRes:number:args:)")));
- (SharedPluralFormattedStringDesc *)PluralFormattedPluralsRes:(SharedPluralsResource *)pluralsRes number:(int32_t)number args_:(NSArray<id> *)args __attribute__((swift_name("PluralFormatted(pluralsRes:number:args_:)")));
- (SharedRawStringDesc *)RawString:(NSString *)string __attribute__((swift_name("Raw(string:)")));
- (SharedResourceStringDesc *)ResourceStringRes:(SharedStringResource *)stringRes __attribute__((swift_name("Resource(stringRes:)")));
- (SharedResourceFormattedStringDesc *)ResourceFormattedStringRes:(SharedStringResource *)stringRes args:(SharedKotlinArray<id> *)args __attribute__((swift_name("ResourceFormatted(stringRes:args:)")));
- (SharedResourceFormattedStringDesc *)ResourceFormattedStringRes:(SharedStringResource *)stringRes args_:(NSArray<id> *)args __attribute__((swift_name("ResourceFormatted(stringRes:args_:)")));
@end

@interface SharedColorDescCompanion (Extensions)
- (id<SharedColorDesc>)ResourceResource:(SharedColorResource *)resource __attribute__((swift_name("Resource(resource:)")));
- (id<SharedColorDesc>)SingleColor:(SharedColor *)color __attribute__((swift_name("Single(color:)")));
- (id<SharedColorDesc>)ThemedLightColor:(SharedColor *)lightColor darkColor:(SharedColor *)darkColor __attribute__((swift_name("Themed(lightColor:darkColor:)")));
@end

@interface SharedImageDescCompanion (Extensions)
- (id<SharedImageDesc>)ResourceResource:(SharedImageResource *)resource __attribute__((swift_name("Resource(resource:)")));
- (id<SharedImageDesc>)UrlUrl:(NSString *)url __attribute__((swift_name("Url(url:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalDate.Companion")))
@interface SharedKotlinx_datetimeLocalDateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinx_datetimeLocalDateCompanion *shared __attribute__((swift_name("shared")));
- (SharedKotlinx_datetimeLocalDate *)fromEpochDaysEpochDays:(int32_t)epochDays __attribute__((swift_name("fromEpochDays(epochDays:)")));
- (SharedKotlinx_datetimeLocalDate *)parseIsoString:(NSString *)isoString __attribute__((swift_name("parse(isoString:)")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end

@interface SharedKotlinx_datetimeLocalDateCompanion (Extensions)
- (SharedKotlinx_datetimeLocalDate *)now __attribute__((swift_name("now()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalDateTime.Companion")))
@interface SharedKotlinx_datetimeLocalDateTimeCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinx_datetimeLocalDateTimeCompanion *shared __attribute__((swift_name("shared")));
- (SharedKotlinx_datetimeLocalDateTime *)parseIsoString:(NSString *)isoString __attribute__((swift_name("parse(isoString:)")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end

@interface SharedKotlinx_datetimeLocalDateTimeCompanion (Extensions)
- (SharedKotlinx_datetimeLocalDateTime *)now __attribute__((swift_name("now()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreKoin")))
@interface SharedKoin_coreKoin : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)close __attribute__((swift_name("close()")));
- (void)createEagerInstances __attribute__((swift_name("createEagerInstances()")));
- (SharedKoin_coreScope *)createScopeT:(id<SharedKoin_coreKoinScopeComponent>)t __attribute__((swift_name("createScope(t:)")));
- (SharedKoin_coreScope *)createScopeScopeId:(NSString *)scopeId __attribute__((swift_name("createScope(scopeId:)")));
- (SharedKoin_coreScope *)createScopeScopeId:(NSString *)scopeId source:(id _Nullable)source __attribute__((swift_name("createScope(scopeId:source:)")));
- (SharedKoin_coreScope *)createScopeScopeId:(NSString *)scopeId qualifier:(id<SharedKoin_coreQualifier>)qualifier source:(id _Nullable)source __attribute__((swift_name("createScope(scopeId:qualifier:source:)")));
- (void)declareInstance:(id _Nullable)instance qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier secondaryTypes:(NSArray<id<SharedKotlinKClass>> *)secondaryTypes allowOverride:(BOOL)allowOverride __attribute__((swift_name("declare(instance:qualifier:secondaryTypes:allowOverride:)")));
- (void)deletePropertyKey:(NSString *)key __attribute__((swift_name("deleteProperty(key:)")));
- (void)deleteScopeScopeId:(NSString *)scopeId __attribute__((swift_name("deleteScope(scopeId:)")));
- (id)getQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(qualifier:parameters:)")));
- (id _Nullable)getClazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(clazz:qualifier:parameters:)")));
- (NSArray<id> *)getAll __attribute__((swift_name("getAll()")));
- (SharedKoin_coreScope *)getOrCreateScopeScopeId:(NSString *)scopeId __attribute__((swift_name("getOrCreateScope(scopeId:)")));
- (SharedKoin_coreScope *)getOrCreateScopeScopeId:(NSString *)scopeId qualifier:(id<SharedKoin_coreQualifier>)qualifier source:(id _Nullable)source __attribute__((swift_name("getOrCreateScope(scopeId:qualifier:source:)")));
- (id _Nullable)getOrNullQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(qualifier:parameters:)")));
- (id _Nullable)getOrNullClazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(clazz:qualifier:parameters:)")));
- (id _Nullable)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (id)getPropertyKey:(NSString *)key defaultValue:(id)defaultValue __attribute__((swift_name("getProperty(key:defaultValue:)")));
- (SharedKoin_coreScope *)getScopeScopeId:(NSString *)scopeId __attribute__((swift_name("getScope(scopeId:)")));
- (SharedKoin_coreScope * _Nullable)getScopeOrNullScopeId:(NSString *)scopeId __attribute__((swift_name("getScopeOrNull(scopeId:)")));
- (id<SharedKotlinLazy>)injectQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier mode:(SharedKotlinLazyThreadSafetyMode *)mode parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("inject(qualifier:mode:parameters:)")));
- (id<SharedKotlinLazy>)injectOrNullQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier mode:(SharedKotlinLazyThreadSafetyMode *)mode parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("injectOrNull(qualifier:mode:parameters:)")));
- (void)loadModulesModules:(NSArray<SharedKoin_coreModule *> *)modules allowOverride:(BOOL)allowOverride createEagerInstances:(BOOL)createEagerInstances __attribute__((swift_name("loadModules(modules:allowOverride:createEagerInstances:)")));
- (void)setPropertyKey:(NSString *)key value:(id)value __attribute__((swift_name("setProperty(key:value:)")));
- (void)setupLoggerLogger:(SharedKoin_coreLogger *)logger __attribute__((swift_name("setupLogger(logger:)")));
- (void)unloadModulesModules:(NSArray<SharedKoin_coreModule *> *)modules __attribute__((swift_name("unloadModules(modules:)")));
@property (readonly) SharedKoin_coreExtensionManager *extensionManager __attribute__((swift_name("extensionManager")));
@property (readonly) SharedKoin_coreInstanceRegistry *instanceRegistry __attribute__((swift_name("instanceRegistry")));
@property (readonly) SharedKoin_coreLogger *logger __attribute__((swift_name("logger")));
@property (readonly) SharedKoin_corePropertyRegistry *propertyRegistry __attribute__((swift_name("propertyRegistry")));
@property (readonly) SharedKoin_coreScopeRegistry *scopeRegistry __attribute__((swift_name("scopeRegistry")));
@end

@interface SharedKoin_coreKoin (Extensions)
- (id)getObjCClass:(Class)objCClass __attribute__((swift_name("get(objCClass:)")));
- (id)getObjCProtocol:(Protocol *)objCProtocol __attribute__((swift_name("get(objCProtocol:)")));
- (id)getObjCClass:(Class)objCClass parameter:(id _Nullable)parameter __attribute__((swift_name("get(objCClass:parameter:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ArticleKt")))
@interface SharedArticleKt : SharedBase
+ (NSString *)toDateString:(NSString * _Nullable)receiver __attribute__((swift_name("toDateString(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ColorDescExtKt")))
@interface SharedColorDescExtKt : SharedBase
+ (UIColor *)getUIColor:(id<SharedColorDesc>)receiver __attribute__((swift_name("getUIColor(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Di_iosKt")))
@interface SharedDi_iosKt : SharedBase
+ (id<SharedKotlinKClass> _Nullable)getOriginalKotlinClassObjCClass:(Class)objCClass __attribute__((swift_name("getOriginalKotlinClass(objCClass:)")));
+ (SharedKoin_coreKoinApplication *)doInitKoin __attribute__((swift_name("doInitKoin()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DiKt")))
@interface SharedDiKt : SharedBase
@property (class, readonly) NSString *DEFAULT_DISPATCHER_NAME __attribute__((swift_name("DEFAULT_DISPATCHER_NAME")));
@property (class, readonly) NSString *DEFAULT_SCOPE __attribute__((swift_name("DEFAULT_SCOPE")));
@property (class, readonly) NSString *IO_DISPATCHER_NAME __attribute__((swift_name("IO_DISPATCHER_NAME")));
@property (class, readonly) NSString *MAIN_DISPATCHER_NAME __attribute__((swift_name("MAIN_DISPATCHER_NAME")));
@property (class, readonly) SharedKoin_coreModule *sharedModule __attribute__((swift_name("sharedModule")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("FlowExtKt")))
@interface SharedFlowExtKt : SharedBase
+ (SharedCommonFlow<id> *)asCommonFlow:(id<SharedKotlinx_coroutines_coreFlow>)receiver __attribute__((swift_name("asCommonFlow(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ImageDescUrlKt")))
@interface SharedImageDescUrlKt : SharedBase
+ (id<SharedImageDesc>)asImageUrl:(NSString *)receiver __attribute__((swift_name("asImageUrl(_:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("LogKt")))
@interface SharedLogKt : SharedBase
+ (void)appLogMessage:(NSString *)message __attribute__((swift_name("appLog(message:)")));
+ (void)doInitLogs __attribute__((swift_name("doInitLogs()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("NSBundleExtKt")))
@interface SharedNSBundleExtKt : SharedBase
+ (NSBundle *)loadableBundle:(Class)receiver identifier:(NSString *)identifier __attribute__((swift_name("loadableBundle(_:identifier:)")));
@property (class) BOOL isBundleSearchLogEnabled __attribute__((swift_name("isBundleSearchLogEnabled")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Platform_iosKt")))
@interface SharedPlatform_iosKt : SharedBase
+ (id<SharedPlatform>)getPlatform __attribute__((swift_name("getPlatform()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PlatformIOSKt")))
@interface SharedPlatformIOSKt : SharedBase
+ (SharedTextState *)getTextStateMockText:(NSString *)text __attribute__((swift_name("getTextStateMock(text:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ResourceContainerExtKt")))
@interface SharedResourceContainerExtKt : SharedBase
+ (SharedAssetResource * _Nullable)getAssetByFilePath:(id<SharedResourceContainer>)receiver filePath:(NSString *)filePath __attribute__((swift_name("getAssetByFilePath(_:filePath:)")));
+ (SharedImageResource * _Nullable)getImageByFileName:(id<SharedResourceContainer>)receiver fileName:(NSString *)fileName __attribute__((swift_name("getImageByFileName(_:fileName:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("StringDescKt")))
@interface SharedStringDescKt : SharedBase
+ (SharedRawStringDesc *)desc:(NSString *)receiver __attribute__((swift_name("desc(_:)")));
+ (id<SharedStringDesc>)joinToStringDesc:(id)receiver separator:(NSString *)separator __attribute__((swift_name("joinToStringDesc(_:separator:)")));
+ (id<SharedStringDesc>)plus:(id<SharedStringDesc>)receiver other:(id<SharedStringDesc>)other __attribute__((swift_name("plus(_:other:)")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.3")
*/
__attribute__((swift_name("KotlinCoroutineContext")))
@protocol SharedKotlinCoroutineContext
@required
- (id _Nullable)foldInitial:(id _Nullable)initial operation:(id _Nullable (^)(id _Nullable, id<SharedKotlinCoroutineContextElement>))operation __attribute__((swift_name("fold(initial:operation:)")));
- (id<SharedKotlinCoroutineContextElement> _Nullable)getKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("get(key:)")));
- (id<SharedKotlinCoroutineContext>)minusKeyKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("minusKey(key:)")));
- (id<SharedKotlinCoroutineContext>)plusContext:(id<SharedKotlinCoroutineContext>)context __attribute__((swift_name("plus(context:)")));
@end

__attribute__((swift_name("KotlinRuntimeException")))
@interface SharedKotlinRuntimeException : SharedKotlinException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("KotlinIllegalStateException")))
@interface SharedKotlinIllegalStateException : SharedKotlinRuntimeException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.4")
*/
__attribute__((swift_name("KotlinCancellationException")))
@interface SharedKotlinCancellationException : SharedKotlinIllegalStateException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
@end

__attribute__((swift_name("RuntimeCloseable")))
@protocol SharedRuntimeCloseable
@required
- (void)close __attribute__((swift_name("close()")));
@end

__attribute__((swift_name("RuntimeSqlDriver")))
@protocol SharedRuntimeSqlDriver <SharedRuntimeCloseable>
@required
- (void)addListenerQueryKeys:(SharedKotlinArray<NSString *> *)queryKeys listener:(id<SharedRuntimeQueryListener>)listener __attribute__((swift_name("addListener(queryKeys:listener:)")));
- (SharedRuntimeTransacterTransaction * _Nullable)currentTransaction __attribute__((swift_name("currentTransaction()")));
- (id<SharedRuntimeQueryResult>)executeIdentifier:(SharedInt * _Nullable)identifier sql:(NSString *)sql parameters:(int32_t)parameters binders:(void (^ _Nullable)(id<SharedRuntimeSqlPreparedStatement>))binders __attribute__((swift_name("execute(identifier:sql:parameters:binders:)")));
- (id<SharedRuntimeQueryResult>)executeQueryIdentifier:(SharedInt * _Nullable)identifier sql:(NSString *)sql mapper:(id<SharedRuntimeQueryResult> (^)(id<SharedRuntimeSqlCursor>))mapper parameters:(int32_t)parameters binders:(void (^ _Nullable)(id<SharedRuntimeSqlPreparedStatement>))binders __attribute__((swift_name("executeQuery(identifier:sql:mapper:parameters:binders:)")));
- (id<SharedRuntimeQueryResult>)doNewTransaction __attribute__((swift_name("doNewTransaction()")));
- (void)notifyListenersQueryKeys:(SharedKotlinArray<NSString *> *)queryKeys __attribute__((swift_name("notifyListeners(queryKeys:)")));
- (void)removeListenerQueryKeys:(SharedKotlinArray<NSString *> *)queryKeys listener:(id<SharedRuntimeQueryListener>)listener __attribute__((swift_name("removeListener(queryKeys:listener:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreModule")))
@interface SharedKoin_coreModule : SharedBase
- (instancetype)initWith_createdAtStart:(BOOL)_createdAtStart __attribute__((swift_name("init(_createdAtStart:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (SharedKoin_coreKoinDefinition<id> *)factoryQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier definition:(id _Nullable (^)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *))definition __attribute__((swift_name("factory(qualifier:definition:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (void)includesModule:(SharedKotlinArray<SharedKoin_coreModule *> *)module __attribute__((swift_name("includes(module:)")));
- (void)includesModule_:(id)module __attribute__((swift_name("includes(module_:)")));
- (void)indexPrimaryTypeInstanceFactory:(SharedKoin_coreInstanceFactory<id> *)instanceFactory __attribute__((swift_name("indexPrimaryType(instanceFactory:)")));
- (void)indexSecondaryTypesInstanceFactory:(SharedKoin_coreInstanceFactory<id> *)instanceFactory __attribute__((swift_name("indexSecondaryTypes(instanceFactory:)")));
- (NSArray<SharedKoin_coreModule *> *)plusModules:(NSArray<SharedKoin_coreModule *> *)modules __attribute__((swift_name("plus(modules:)")));
- (NSArray<SharedKoin_coreModule *> *)plusModule:(SharedKoin_coreModule *)module __attribute__((swift_name("plus(module:)")));
- (void)prepareForCreationAtStartInstanceFactory:(SharedKoin_coreSingleInstanceFactory<id> *)instanceFactory __attribute__((swift_name("prepareForCreationAtStart(instanceFactory:)")));
- (void)scopeScopeSet:(void (^)(SharedKoin_coreScopeDSL *))scopeSet __attribute__((swift_name("scope(scopeSet:)")));
- (void)scopeQualifier:(id<SharedKoin_coreQualifier>)qualifier scopeSet:(void (^)(SharedKoin_coreScopeDSL *))scopeSet __attribute__((swift_name("scope(qualifier:scopeSet:)")));
- (SharedKoin_coreKoinDefinition<id> *)singleQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier createdAtStart:(BOOL)createdAtStart definition:(id _Nullable (^)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *))definition __attribute__((swift_name("single(qualifier:createdAtStart:definition:)")));
@property (readonly) SharedMutableSet<SharedKoin_coreSingleInstanceFactory<id> *> *eagerInstances __attribute__((swift_name("eagerInstances")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSMutableArray<SharedKoin_coreModule *> *includedModules __attribute__((swift_name("includedModules")));
@property (readonly) BOOL isLoaded __attribute__((swift_name("isLoaded")));
@property (readonly) SharedMutableDictionary<NSString *, SharedKoin_coreInstanceFactory<id> *> *mappings __attribute__((swift_name("mappings")));
@end

__attribute__((swift_name("KotlinFunction")))
@protocol SharedKotlinFunction
@required
@end

__attribute__((swift_name("KotlinSuspendFunction1")))
@protocol SharedKotlinSuspendFunction1 <SharedKotlinFunction>
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)invokeP1:(id _Nullable)p1 completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("invoke(p1:completionHandler:)")));
@end

__attribute__((swift_name("RuntimeSqlSchema")))
@protocol SharedRuntimeSqlSchema
@required
- (id<SharedRuntimeQueryResult>)createDriver:(id<SharedRuntimeSqlDriver>)driver __attribute__((swift_name("create(driver:)")));
- (id<SharedRuntimeQueryResult>)migrateDriver:(id<SharedRuntimeSqlDriver>)driver oldVersion:(int64_t)oldVersion newVersion:(int64_t)newVersion callbacks:(SharedKotlinArray<SharedRuntimeAfterVersion *> *)callbacks __attribute__((swift_name("migrate(driver:oldVersion:newVersion:callbacks:)")));
@property (readonly) int64_t version __attribute__((swift_name("version")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="2.0")
*/
__attribute__((swift_name("KotlinAutoCloseable")))
@protocol SharedKotlinAutoCloseable
@required
- (void)close __attribute__((swift_name("close()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface SharedKotlinArray<T> : SharedBase
+ (instancetype)arrayWithSize:(int32_t)size init:(T _Nullable (^)(SharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (T _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<SharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(T _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineScope")))
@protocol SharedKotlinx_coroutines_coreCoroutineScope
@required
@property (readonly) id<SharedKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreSharedFlow")))
@protocol SharedKotlinx_coroutines_coreSharedFlow <SharedKotlinx_coroutines_coreFlow>
@required
@property (readonly) NSArray<id> *replayCache __attribute__((swift_name("replayCache")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreStateFlow")))
@protocol SharedKotlinx_coroutines_coreStateFlow <SharedKotlinx_coroutines_coreSharedFlow>
@required
@property (readonly) id _Nullable value __attribute__((swift_name("value")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreFlowCollector")))
@protocol SharedKotlinx_coroutines_coreFlowCollector
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)emitValue:(id _Nullable)value completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("emit(value:completionHandler:)")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreMutableSharedFlow")))
@protocol SharedKotlinx_coroutines_coreMutableSharedFlow <SharedKotlinx_coroutines_coreSharedFlow, SharedKotlinx_coroutines_coreFlowCollector>
@required

/**
 * @note annotations
 *   kotlinx.coroutines.ExperimentalCoroutinesApi
*/
- (void)resetReplayCache __attribute__((swift_name("resetReplayCache()")));
- (BOOL)tryEmitValue:(id _Nullable)value __attribute__((swift_name("tryEmit(value:)")));
@property (readonly) id<SharedKotlinx_coroutines_coreStateFlow> subscriptionCount __attribute__((swift_name("subscriptionCount")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreMutableStateFlow")))
@protocol SharedKotlinx_coroutines_coreMutableStateFlow <SharedKotlinx_coroutines_coreStateFlow, SharedKotlinx_coroutines_coreMutableSharedFlow>
@required
- (void)setValue:(id _Nullable)value __attribute__((swift_name("setValue(_:)")));
- (BOOL)compareAndSetExpect:(id _Nullable)expect update:(id _Nullable)update __attribute__((swift_name("compareAndSet(expect:update:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinEnumCompanion")))
@interface SharedKotlinEnumCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinEnumCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinUnit")))
@interface SharedKotlinUnit : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)unit __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinUnit *shared __attribute__((swift_name("shared")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("RuntimeTransactionCallbacks")))
@protocol SharedRuntimeTransactionCallbacks
@required
- (void)afterCommitFunction:(void (^)(void))function __attribute__((swift_name("afterCommit(function:)")));
- (void)afterRollbackFunction:(void (^)(void))function __attribute__((swift_name("afterRollback(function:)")));
@end

__attribute__((swift_name("RuntimeTransacterTransaction")))
@interface SharedRuntimeTransacterTransaction : SharedBase <SharedRuntimeTransactionCallbacks>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)afterCommitFunction:(void (^)(void))function __attribute__((swift_name("afterCommit(function:)")));
- (void)afterRollbackFunction:(void (^)(void))function __attribute__((swift_name("afterRollback(function:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (id<SharedRuntimeQueryResult>)endTransactionSuccessful:(BOOL)successful __attribute__((swift_name("endTransaction(successful:)")));

/**
 * @note This property has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
@property (readonly) SharedRuntimeTransacterTransaction * _Nullable enclosingTransaction __attribute__((swift_name("enclosingTransaction")));
@end

__attribute__((swift_name("RuntimeExecutableQuery")))
@interface SharedRuntimeExecutableQuery<__covariant RowType> : SharedBase
- (instancetype)initWithMapper:(RowType (^)(id<SharedRuntimeSqlCursor>))mapper __attribute__((swift_name("init(mapper:)"))) __attribute__((objc_designated_initializer));
- (id<SharedRuntimeQueryResult>)executeMapper:(id<SharedRuntimeQueryResult> (^)(id<SharedRuntimeSqlCursor>))mapper __attribute__((swift_name("execute(mapper:)")));
- (NSArray<RowType> *)executeAsList __attribute__((swift_name("executeAsList()")));
- (RowType)executeAsOne __attribute__((swift_name("executeAsOne()")));
- (RowType _Nullable)executeAsOneOrNull __attribute__((swift_name("executeAsOneOrNull()")));
@property (readonly) RowType (^mapper)(id<SharedRuntimeSqlCursor>) __attribute__((swift_name("mapper")));
@end

__attribute__((swift_name("RuntimeQuery")))
@interface SharedRuntimeQuery<__covariant RowType> : SharedRuntimeExecutableQuery<RowType>
- (instancetype)initWithMapper:(RowType (^)(id<SharedRuntimeSqlCursor>))mapper __attribute__((swift_name("init(mapper:)"))) __attribute__((objc_designated_initializer));
- (void)addListenerListener:(id<SharedRuntimeQueryListener>)listener __attribute__((swift_name("addListener(listener:)")));
- (void)removeListenerListener:(id<SharedRuntimeQueryListener>)listener __attribute__((swift_name("removeListener(listener:)")));
@end

__attribute__((swift_name("Ktor_httpHttpMessage")))
@protocol SharedKtor_httpHttpMessage
@required
@property (readonly) id<SharedKtor_httpHeaders> headers __attribute__((swift_name("headers")));
@end

__attribute__((swift_name("Ktor_client_coreHttpResponse")))
@interface SharedKtor_client_coreHttpResponse : SharedBase <SharedKtor_httpHttpMessage, SharedKotlinx_coroutines_coreCoroutineScope>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKtor_client_coreHttpClientCall *call __attribute__((swift_name("call")));
@property (readonly) id<SharedKtor_ioByteReadChannel> content __attribute__((swift_name("content")));
@property (readonly) SharedKtor_utilsGMTDate *requestTime __attribute__((swift_name("requestTime")));
@property (readonly) SharedKtor_utilsGMTDate *responseTime __attribute__((swift_name("responseTime")));
@property (readonly) SharedKtor_httpHttpStatusCode *status __attribute__((swift_name("status")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *version_ __attribute__((swift_name("version_")));
@end

__attribute__((swift_name("Ktor_ioCloseable")))
@protocol SharedKtor_ioCloseable
@required
- (void)close __attribute__((swift_name("close()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpClient")))
@interface SharedKtor_client_coreHttpClient : SharedBase <SharedKotlinx_coroutines_coreCoroutineScope, SharedKtor_ioCloseable>
- (instancetype)initWithEngine:(id<SharedKtor_client_coreHttpClientEngine>)engine userConfig:(SharedKtor_client_coreHttpClientConfig<SharedKtor_client_coreHttpClientEngineConfig *> *)userConfig __attribute__((swift_name("init(engine:userConfig:)"))) __attribute__((objc_designated_initializer));
- (void)close __attribute__((swift_name("close()")));
- (SharedKtor_client_coreHttpClient *)configBlock:(void (^)(SharedKtor_client_coreHttpClientConfig<id> *))block __attribute__((swift_name("config(block:)")));
- (BOOL)isSupportedCapability:(id<SharedKtor_client_coreHttpClientEngineCapability>)capability __attribute__((swift_name("isSupported(capability:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property (readonly) id<SharedKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@property (readonly) id<SharedKtor_client_coreHttpClientEngine> engine __attribute__((swift_name("engine")));
@property (readonly) SharedKtor_client_coreHttpClientEngineConfig *engineConfig __attribute__((swift_name("engineConfig")));
@property (readonly) SharedKtor_eventsEvents *monitor __attribute__((swift_name("monitor")));
@property (readonly) SharedKtor_client_coreHttpReceivePipeline *receivePipeline __attribute__((swift_name("receivePipeline")));
@property (readonly) SharedKtor_client_coreHttpRequestPipeline *requestPipeline __attribute__((swift_name("requestPipeline")));
@property (readonly) SharedKtor_client_coreHttpResponsePipeline *responsePipeline __attribute__((swift_name("responsePipeline")));
@property (readonly) SharedKtor_client_coreHttpSendPipeline *sendPipeline __attribute__((swift_name("sendPipeline")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreEncoder")))
@protocol SharedKotlinx_serialization_coreEncoder
@required
- (id<SharedKotlinx_serialization_coreCompositeEncoder>)beginCollectionDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor collectionSize:(int32_t)collectionSize __attribute__((swift_name("beginCollection(descriptor:collectionSize:)")));
- (id<SharedKotlinx_serialization_coreCompositeEncoder>)beginStructureDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("beginStructure(descriptor:)")));
- (void)encodeBooleanValue:(BOOL)value __attribute__((swift_name("encodeBoolean(value:)")));
- (void)encodeByteValue:(int8_t)value __attribute__((swift_name("encodeByte(value:)")));
- (void)encodeCharValue:(unichar)value __attribute__((swift_name("encodeChar(value:)")));
- (void)encodeDoubleValue:(double)value __attribute__((swift_name("encodeDouble(value:)")));
- (void)encodeEnumEnumDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)enumDescriptor index:(int32_t)index __attribute__((swift_name("encodeEnum(enumDescriptor:index:)")));
- (void)encodeFloatValue:(float)value __attribute__((swift_name("encodeFloat(value:)")));
- (id<SharedKotlinx_serialization_coreEncoder>)encodeInlineDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("encodeInline(descriptor:)")));
- (void)encodeIntValue:(int32_t)value __attribute__((swift_name("encodeInt(value:)")));
- (void)encodeLongValue:(int64_t)value __attribute__((swift_name("encodeLong(value:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (void)encodeNotNullMark __attribute__((swift_name("encodeNotNullMark()")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (void)encodeNull __attribute__((swift_name("encodeNull()")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (void)encodeNullableSerializableValueSerializer:(id<SharedKotlinx_serialization_coreSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableValue(serializer:value:)")));
- (void)encodeSerializableValueSerializer:(id<SharedKotlinx_serialization_coreSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableValue(serializer:value:)")));
- (void)encodeShortValue:(int16_t)value __attribute__((swift_name("encodeShort(value:)")));
- (void)encodeStringValue:(NSString *)value __attribute__((swift_name("encodeString(value:)")));
@property (readonly) SharedKotlinx_serialization_coreSerializersModule *serializersModule __attribute__((swift_name("serializersModule")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreSerialDescriptor")))
@protocol SharedKotlinx_serialization_coreSerialDescriptor
@required

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (NSArray<id<SharedKotlinAnnotation>> *)getElementAnnotationsIndex:(int32_t)index __attribute__((swift_name("getElementAnnotations(index:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id<SharedKotlinx_serialization_coreSerialDescriptor>)getElementDescriptorIndex:(int32_t)index __attribute__((swift_name("getElementDescriptor(index:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (int32_t)getElementIndexName:(NSString *)name __attribute__((swift_name("getElementIndex(name:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (NSString *)getElementNameIndex:(int32_t)index __attribute__((swift_name("getElementName(index:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (BOOL)isElementOptionalIndex:(int32_t)index __attribute__((swift_name("isElementOptional(index:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
@property (readonly) NSArray<id<SharedKotlinAnnotation>> *annotations __attribute__((swift_name("annotations")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
@property (readonly) int32_t elementsCount __attribute__((swift_name("elementsCount")));
@property (readonly) BOOL isInline __attribute__((swift_name("isInline")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
@property (readonly) BOOL isNullable __attribute__((swift_name("isNullable")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
@property (readonly) SharedKotlinx_serialization_coreSerialKind *kind __attribute__((swift_name("kind")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
@property (readonly) NSString *serialName __attribute__((swift_name("serialName")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreDecoder")))
@protocol SharedKotlinx_serialization_coreDecoder
@required
- (id<SharedKotlinx_serialization_coreCompositeDecoder>)beginStructureDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("beginStructure(descriptor:)")));
- (BOOL)decodeBoolean __attribute__((swift_name("decodeBoolean()")));
- (int8_t)decodeByte __attribute__((swift_name("decodeByte()")));
- (unichar)decodeChar __attribute__((swift_name("decodeChar()")));
- (double)decodeDouble __attribute__((swift_name("decodeDouble()")));
- (int32_t)decodeEnumEnumDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)enumDescriptor __attribute__((swift_name("decodeEnum(enumDescriptor:)")));
- (float)decodeFloat __attribute__((swift_name("decodeFloat()")));
- (id<SharedKotlinx_serialization_coreDecoder>)decodeInlineDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("decodeInline(descriptor:)")));
- (int32_t)decodeInt __attribute__((swift_name("decodeInt()")));
- (int64_t)decodeLong __attribute__((swift_name("decodeLong()")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (BOOL)decodeNotNullMark __attribute__((swift_name("decodeNotNullMark()")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (SharedKotlinNothing * _Nullable)decodeNull __attribute__((swift_name("decodeNull()")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id _Nullable)decodeNullableSerializableValueDeserializer:(id<SharedKotlinx_serialization_coreDeserializationStrategy>)deserializer __attribute__((swift_name("decodeNullableSerializableValue(deserializer:)")));
- (id _Nullable)decodeSerializableValueDeserializer:(id<SharedKotlinx_serialization_coreDeserializationStrategy>)deserializer __attribute__((swift_name("decodeSerializableValue(deserializer:)")));
- (int16_t)decodeShort __attribute__((swift_name("decodeShort()")));
- (NSString *)decodeString __attribute__((swift_name("decodeString()")));
@property (readonly) SharedKotlinx_serialization_coreSerializersModule *serializersModule __attribute__((swift_name("serializersModule")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable(with=NormalClass(value=kotlinx/datetime/serializers/LocalDateIso8601Serializer))
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalDate")))
@interface SharedKotlinx_datetimeLocalDate : SharedBase <SharedKotlinComparable>
- (instancetype)initWithYear:(int32_t)year monthNumber:(int32_t)monthNumber dayOfMonth:(int32_t)dayOfMonth __attribute__((swift_name("init(year:monthNumber:dayOfMonth:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithYear:(int32_t)year month:(SharedKotlinx_datetimeMonth *)month dayOfMonth:(int32_t)dayOfMonth __attribute__((swift_name("init(year:month:dayOfMonth:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinx_datetimeLocalDateCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(SharedKotlinx_datetimeLocalDate *)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (int32_t)toEpochDays __attribute__((swift_name("toEpochDays()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t dayOfMonth __attribute__((swift_name("dayOfMonth")));
@property (readonly) SharedKotlinx_datetimeDayOfWeek *dayOfWeek __attribute__((swift_name("dayOfWeek")));
@property (readonly) int32_t dayOfYear __attribute__((swift_name("dayOfYear")));
@property (readonly) SharedKotlinx_datetimeMonth *month __attribute__((swift_name("month")));
@property (readonly) int32_t monthNumber __attribute__((swift_name("monthNumber")));
@property (readonly) int32_t year __attribute__((swift_name("year")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable(with=NormalClass(value=kotlinx/datetime/serializers/LocalDateTimeIso8601Serializer))
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalDateTime")))
@interface SharedKotlinx_datetimeLocalDateTime : SharedBase <SharedKotlinComparable>
- (instancetype)initWithDate:(SharedKotlinx_datetimeLocalDate *)date time:(SharedKotlinx_datetimeLocalTime *)time __attribute__((swift_name("init(date:time:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithYear:(int32_t)year monthNumber:(int32_t)monthNumber dayOfMonth:(int32_t)dayOfMonth hour:(int32_t)hour minute:(int32_t)minute second:(int32_t)second nanosecond:(int32_t)nanosecond __attribute__((swift_name("init(year:monthNumber:dayOfMonth:hour:minute:second:nanosecond:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithYear:(int32_t)year month:(SharedKotlinx_datetimeMonth *)month dayOfMonth:(int32_t)dayOfMonth hour:(int32_t)hour minute:(int32_t)minute second:(int32_t)second nanosecond:(int32_t)nanosecond __attribute__((swift_name("init(year:month:dayOfMonth:hour:minute:second:nanosecond:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinx_datetimeLocalDateTimeCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(SharedKotlinx_datetimeLocalDateTime *)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKotlinx_datetimeLocalDate *date __attribute__((swift_name("date")));
@property (readonly) int32_t dayOfMonth __attribute__((swift_name("dayOfMonth")));
@property (readonly) SharedKotlinx_datetimeDayOfWeek *dayOfWeek __attribute__((swift_name("dayOfWeek")));
@property (readonly) int32_t dayOfYear __attribute__((swift_name("dayOfYear")));
@property (readonly) int32_t hour __attribute__((swift_name("hour")));
@property (readonly) int32_t minute __attribute__((swift_name("minute")));
@property (readonly) SharedKotlinx_datetimeMonth *month __attribute__((swift_name("month")));
@property (readonly) int32_t monthNumber __attribute__((swift_name("monthNumber")));
@property (readonly) int32_t nanosecond __attribute__((swift_name("nanosecond")));
@property (readonly) int32_t second __attribute__((swift_name("second")));
@property (readonly) SharedKotlinx_datetimeLocalTime *time __attribute__((swift_name("time")));
@property (readonly) int32_t year __attribute__((swift_name("year")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinObjCErrorException")))
@interface SharedKotlinObjCErrorException : SharedKotlinException
- (instancetype)initWithMessage:(NSString * _Nullable)message error:(id)error __attribute__((swift_name("init(message:error:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("Koin_coreLockable")))
@interface SharedKoin_coreLockable : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreScope")))
@interface SharedKoin_coreScope : SharedKoin_coreLockable
- (instancetype)initWithScopeQualifier:(id<SharedKoin_coreQualifier>)scopeQualifier id:(NSString *)id isRoot:(BOOL)isRoot _koin:(SharedKoin_coreKoin *)_koin __attribute__((swift_name("init(scopeQualifier:id:isRoot:_koin:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (void)close __attribute__((swift_name("close()")));
- (void)declareInstance:(id _Nullable)instance qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier secondaryTypes:(NSArray<id<SharedKotlinKClass>> *)secondaryTypes allowOverride:(BOOL)allowOverride __attribute__((swift_name("declare(instance:qualifier:secondaryTypes:allowOverride:)")));
- (id)getQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(qualifier:parameters:)")));
- (id _Nullable)getClazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("get(clazz:qualifier:parameters:)")));
- (NSArray<id> *)getAll __attribute__((swift_name("getAll()")));
- (NSArray<id> *)getAllClazz:(id<SharedKotlinKClass>)clazz __attribute__((swift_name("getAll(clazz:)")));
- (SharedKoin_coreKoin *)getKoin __attribute__((swift_name("getKoin()")));
- (id _Nullable)getOrNullQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(qualifier:parameters:)")));
- (id _Nullable)getOrNullClazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("getOrNull(clazz:qualifier:parameters:)")));
- (id)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (id)getPropertyKey:(NSString *)key defaultValue:(id)defaultValue __attribute__((swift_name("getProperty(key:defaultValue:)")));
- (id _Nullable)getPropertyOrNullKey:(NSString *)key __attribute__((swift_name("getPropertyOrNull(key:)")));
- (SharedKoin_coreScope *)getScopeScopeID:(NSString *)scopeID __attribute__((swift_name("getScope(scopeID:)")));
- (id _Nullable)getSource __attribute__((swift_name("getSource()")));
- (id<SharedKotlinLazy>)injectQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier mode:(SharedKotlinLazyThreadSafetyMode *)mode parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("inject(qualifier:mode:parameters:)")));
- (id<SharedKotlinLazy>)injectOrNullQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier mode:(SharedKotlinLazyThreadSafetyMode *)mode parameters:(SharedKoin_coreParametersHolder *(^ _Nullable)(void))parameters __attribute__((swift_name("injectOrNull(qualifier:mode:parameters:)")));
- (BOOL)isNotClosed __attribute__((swift_name("isNotClosed()")));
- (void)linkToScopes:(SharedKotlinArray<SharedKoin_coreScope *> *)scopes __attribute__((swift_name("linkTo(scopes:)")));
- (void)registerCallbackCallback:(id<SharedKoin_coreScopeCallback>)callback __attribute__((swift_name("registerCallback(callback:)")));
- (NSString *)description __attribute__((swift_name("description()")));
- (void)unlinkScopes:(SharedKotlinArray<SharedKoin_coreScope *> *)scopes __attribute__((swift_name("unlink(scopes:)")));
@property (readonly) BOOL closed __attribute__((swift_name("closed")));
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) BOOL isRoot __attribute__((swift_name("isRoot")));
@property (readonly) SharedKoin_coreLogger *logger __attribute__((swift_name("logger")));
@property (readonly) id<SharedKoin_coreQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@property id _Nullable sourceValue __attribute__((swift_name("sourceValue")));
@end

__attribute__((swift_name("Koin_coreKoinComponent")))
@protocol SharedKoin_coreKoinComponent
@required
- (SharedKoin_coreKoin *)getKoin __attribute__((swift_name("getKoin()")));
@end

__attribute__((swift_name("Koin_coreKoinScopeComponent")))
@protocol SharedKoin_coreKoinScopeComponent <SharedKoin_coreKoinComponent>
@required
@property (readonly) SharedKoin_coreScope *scope __attribute__((swift_name("scope")));
@end

__attribute__((swift_name("Koin_coreQualifier")))
@protocol SharedKoin_coreQualifier
@required
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((swift_name("KotlinKDeclarationContainer")))
@protocol SharedKotlinKDeclarationContainer
@required
@end

__attribute__((swift_name("KotlinKAnnotatedElement")))
@protocol SharedKotlinKAnnotatedElement
@required
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
__attribute__((swift_name("KotlinKClassifier")))
@protocol SharedKotlinKClassifier
@required
@end

__attribute__((swift_name("KotlinKClass")))
@protocol SharedKotlinKClass <SharedKotlinKDeclarationContainer, SharedKotlinKAnnotatedElement, SharedKotlinKClassifier>
@required

/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
- (BOOL)isInstanceValue:(id _Nullable)value __attribute__((swift_name("isInstance(value:)")));
@property (readonly) NSString * _Nullable qualifiedName __attribute__((swift_name("qualifiedName")));
@property (readonly) NSString * _Nullable simpleName __attribute__((swift_name("simpleName")));
@end

__attribute__((swift_name("Koin_coreParametersHolder")))
@interface SharedKoin_coreParametersHolder : SharedBase
- (instancetype)initWith_values:(NSMutableArray<id> *)_values useIndexedValues:(SharedBoolean * _Nullable)useIndexedValues __attribute__((swift_name("init(_values:useIndexedValues:)"))) __attribute__((objc_designated_initializer));
- (SharedKoin_coreParametersHolder *)addValue:(id)value __attribute__((swift_name("add(value:)")));
- (id _Nullable)component1 __attribute__((swift_name("component1()")));
- (id _Nullable)component2 __attribute__((swift_name("component2()")));
- (id _Nullable)component3 __attribute__((swift_name("component3()")));
- (id _Nullable)component4 __attribute__((swift_name("component4()")));
- (id _Nullable)component5 __attribute__((swift_name("component5()")));
- (id _Nullable)elementAtI:(int32_t)i clazz:(id<SharedKotlinKClass>)clazz __attribute__((swift_name("elementAt(i:clazz:)")));
- (id)get __attribute__((swift_name("get()")));
- (id _Nullable)getI:(int32_t)i __attribute__((swift_name("get(i:)")));
- (id _Nullable)getOrNull __attribute__((swift_name("getOrNull()")));
- (id _Nullable)getOrNullClazz:(id<SharedKotlinKClass>)clazz __attribute__((swift_name("getOrNull(clazz:)")));
- (SharedKoin_coreParametersHolder *)insertIndex:(int32_t)index value:(id)value __attribute__((swift_name("insert(index:value:)")));
- (BOOL)isEmpty __attribute__((swift_name("isEmpty()")));
- (BOOL)isNotEmpty __attribute__((swift_name("isNotEmpty()")));
- (void)setI:(int32_t)i t:(id _Nullable)t __attribute__((swift_name("set(i:t:)")));
- (int32_t)size __attribute__((swift_name("size()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property int32_t index __attribute__((swift_name("index")));
@property (readonly) SharedBoolean * _Nullable useIndexedValues __attribute__((swift_name("useIndexedValues")));
@property (readonly, getter=values_) NSArray<id> *values __attribute__((swift_name("values")));
@end

__attribute__((swift_name("KotlinLazy")))
@protocol SharedKotlinLazy
@required
- (BOOL)isInitialized __attribute__((swift_name("isInitialized()")));
@property (readonly) id _Nullable value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinLazyThreadSafetyMode")))
@interface SharedKotlinLazyThreadSafetyMode : SharedKotlinEnum<SharedKotlinLazyThreadSafetyMode *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKotlinLazyThreadSafetyMode *synchronized __attribute__((swift_name("synchronized")));
@property (class, readonly) SharedKotlinLazyThreadSafetyMode *publication __attribute__((swift_name("publication")));
@property (class, readonly) SharedKotlinLazyThreadSafetyMode *none __attribute__((swift_name("none")));
+ (SharedKotlinArray<SharedKotlinLazyThreadSafetyMode *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedKotlinLazyThreadSafetyMode *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((swift_name("Koin_coreLogger")))
@interface SharedKoin_coreLogger : SharedBase
- (instancetype)initWithLevel:(SharedKoin_coreLevel *)level __attribute__((swift_name("init(level:)"))) __attribute__((objc_designated_initializer));
- (void)debugMsg:(NSString *)msg __attribute__((swift_name("debug(msg:)")));
- (void)displayLevel:(SharedKoin_coreLevel *)level msg:(NSString *)msg __attribute__((swift_name("display(level:msg:)")));
- (void)errorMsg:(NSString *)msg __attribute__((swift_name("error(msg:)")));
- (void)infoMsg:(NSString *)msg __attribute__((swift_name("info(msg:)")));
- (BOOL)isAtLvl:(SharedKoin_coreLevel *)lvl __attribute__((swift_name("isAt(lvl:)")));
- (void)logLvl:(SharedKoin_coreLevel *)lvl msg:(NSString *(^)(void))msg __attribute__((swift_name("log(lvl:msg:)")));
- (void)logLvl:(SharedKoin_coreLevel *)lvl msg_:(NSString *)msg __attribute__((swift_name("log(lvl:msg_:)")));
- (void)warnMsg:(NSString *)msg __attribute__((swift_name("warn(msg:)")));
@property SharedKoin_coreLevel *level __attribute__((swift_name("level")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreExtensionManager")))
@interface SharedKoin_coreExtensionManager : SharedBase
- (instancetype)initWith_koin:(SharedKoin_coreKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
- (void)close __attribute__((swift_name("close()")));
- (id<SharedKoin_coreKoinExtension>)getExtensionId:(NSString *)id __attribute__((swift_name("getExtension(id:)")));
- (id<SharedKoin_coreKoinExtension> _Nullable)getExtensionOrNullId:(NSString *)id __attribute__((swift_name("getExtensionOrNull(id:)")));
- (void)registerExtensionId:(NSString *)id extension:(id<SharedKoin_coreKoinExtension>)extension __attribute__((swift_name("registerExtension(id:extension:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreInstanceRegistry")))
@interface SharedKoin_coreInstanceRegistry : SharedBase
- (instancetype)initWith_koin:(SharedKoin_coreKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
- (void)saveMappingAllowOverride:(BOOL)allowOverride mapping:(NSString *)mapping factory:(SharedKoin_coreInstanceFactory<id> *)factory logWarning:(BOOL)logWarning __attribute__((swift_name("saveMapping(allowOverride:mapping:factory:logWarning:)")));
- (int32_t)size __attribute__((swift_name("size()")));
@property (readonly) SharedKoin_coreKoin *_koin __attribute__((swift_name("_koin")));
@property (readonly) NSDictionary<NSString *, SharedKoin_coreInstanceFactory<id> *> *instances __attribute__((swift_name("instances")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_corePropertyRegistry")))
@interface SharedKoin_corePropertyRegistry : SharedBase
- (instancetype)initWith_koin:(SharedKoin_coreKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
- (void)close __attribute__((swift_name("close()")));
- (void)deletePropertyKey:(NSString *)key __attribute__((swift_name("deleteProperty(key:)")));
- (id _Nullable)getPropertyKey:(NSString *)key __attribute__((swift_name("getProperty(key:)")));
- (void)savePropertiesProperties:(NSDictionary<NSString *, id> *)properties __attribute__((swift_name("saveProperties(properties:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreScopeRegistry")))
@interface SharedKoin_coreScopeRegistry : SharedBase
- (instancetype)initWith_koin:(SharedKoin_coreKoin *)_koin __attribute__((swift_name("init(_koin:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKoin_coreScopeRegistryCompanion *companion __attribute__((swift_name("companion")));
- (void)loadScopesModules:(NSSet<SharedKoin_coreModule *> *)modules __attribute__((swift_name("loadScopes(modules:)")));
@property (readonly) SharedKoin_coreScope *rootScope __attribute__((swift_name("rootScope")));
@property (readonly) NSSet<id<SharedKoin_coreQualifier>> *scopeDefinitions __attribute__((swift_name("scopeDefinitions")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreKoinApplication")))
@interface SharedKoin_coreKoinApplication : SharedBase
@property (class, readonly, getter=companion) SharedKoin_coreKoinApplicationCompanion *companion __attribute__((swift_name("companion")));
- (void)allowOverrideOverride:(BOOL)override __attribute__((swift_name("allowOverride(override:)")));
- (void)close __attribute__((swift_name("close()")));
- (void)createEagerInstances __attribute__((swift_name("createEagerInstances()")));
- (SharedKoin_coreKoinApplication *)loggerLogger:(SharedKoin_coreLogger *)logger __attribute__((swift_name("logger(logger:)")));
- (SharedKoin_coreKoinApplication *)modulesModules:(SharedKotlinArray<SharedKoin_coreModule *> *)modules __attribute__((swift_name("modules(modules:)")));
- (SharedKoin_coreKoinApplication *)modulesModules_:(NSArray<SharedKoin_coreModule *> *)modules __attribute__((swift_name("modules(modules_:)")));
- (SharedKoin_coreKoinApplication *)modulesModules__:(SharedKoin_coreModule *)modules __attribute__((swift_name("modules(modules__:)")));
- (SharedKoin_coreKoinApplication *)printLoggerLevel:(SharedKoin_coreLevel *)level __attribute__((swift_name("printLogger(level:)")));
- (SharedKoin_coreKoinApplication *)propertiesValues:(NSDictionary<NSString *, id> *)values __attribute__((swift_name("properties(values:)")));
@property (readonly) SharedKoin_coreKoin *koin __attribute__((swift_name("koin")));
@end

__attribute__((swift_name("KotlinCoroutineContextElement")))
@protocol SharedKotlinCoroutineContextElement <SharedKotlinCoroutineContext>
@required
@property (readonly) id<SharedKotlinCoroutineContextKey> key __attribute__((swift_name("key")));
@end

__attribute__((swift_name("KotlinCoroutineContextKey")))
@protocol SharedKotlinCoroutineContextKey
@required
@end

__attribute__((swift_name("RuntimeQueryListener")))
@protocol SharedRuntimeQueryListener
@required
- (void)queryResultsChanged __attribute__((swift_name("queryResultsChanged()")));
@end

__attribute__((swift_name("RuntimeQueryResult")))
@protocol SharedRuntimeQueryResult
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)awaitWithCompletionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("await(completionHandler:)")));
@property (readonly) id _Nullable value __attribute__((swift_name("value")));
@end

__attribute__((swift_name("RuntimeSqlPreparedStatement")))
@protocol SharedRuntimeSqlPreparedStatement
@required
- (void)bindBooleanIndex:(int32_t)index boolean:(SharedBoolean * _Nullable)boolean __attribute__((swift_name("bindBoolean(index:boolean:)")));
- (void)bindBytesIndex:(int32_t)index bytes:(SharedKotlinByteArray * _Nullable)bytes __attribute__((swift_name("bindBytes(index:bytes:)")));
- (void)bindDoubleIndex:(int32_t)index double:(SharedDouble * _Nullable)double_ __attribute__((swift_name("bindDouble(index:double:)")));
- (void)bindLongIndex:(int32_t)index long:(SharedLong * _Nullable)long_ __attribute__((swift_name("bindLong(index:long:)")));
- (void)bindStringIndex:(int32_t)index string:(NSString * _Nullable)string __attribute__((swift_name("bindString(index:string:)")));
@end

__attribute__((swift_name("RuntimeSqlCursor")))
@protocol SharedRuntimeSqlCursor
@required
- (SharedBoolean * _Nullable)getBooleanIndex:(int32_t)index __attribute__((swift_name("getBoolean(index:)")));
- (SharedKotlinByteArray * _Nullable)getBytesIndex:(int32_t)index __attribute__((swift_name("getBytes(index:)")));
- (SharedDouble * _Nullable)getDoubleIndex:(int32_t)index __attribute__((swift_name("getDouble(index:)")));
- (SharedLong * _Nullable)getLongIndex:(int32_t)index __attribute__((swift_name("getLong(index:)")));
- (NSString * _Nullable)getStringIndex:(int32_t)index __attribute__((swift_name("getString(index:)")));
- (id<SharedRuntimeQueryResult>)next __attribute__((swift_name("next()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreKoinDefinition")))
@interface SharedKoin_coreKoinDefinition<R> : SharedBase
- (instancetype)initWithModule:(SharedKoin_coreModule *)module factory:(SharedKoin_coreInstanceFactory<R> *)factory __attribute__((swift_name("init(module:factory:)"))) __attribute__((objc_designated_initializer));
- (SharedKoin_coreKoinDefinition<R> *)doCopyModule:(SharedKoin_coreModule *)module factory:(SharedKoin_coreInstanceFactory<R> *)factory __attribute__((swift_name("doCopy(module:factory:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKoin_coreInstanceFactory<R> *factory __attribute__((swift_name("factory")));
@property (readonly) SharedKoin_coreModule *module __attribute__((swift_name("module")));
@end

__attribute__((swift_name("Koin_coreInstanceFactory")))
@interface SharedKoin_coreInstanceFactory<T> : SharedKoin_coreLockable
- (instancetype)initWithBeanDefinition:(SharedKoin_coreBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKoin_coreInstanceFactoryCompanion *companion __attribute__((swift_name("companion")));
- (T _Nullable)createContext:(SharedKoin_coreResolutionContext *)context __attribute__((swift_name("create(context:)")));
- (void)dropScope:(SharedKoin_coreScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(SharedKoin_coreResolutionContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(SharedKoin_coreResolutionContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
@property (readonly) SharedKoin_coreBeanDefinition<T> *beanDefinition __attribute__((swift_name("beanDefinition")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreSingleInstanceFactory")))
@interface SharedKoin_coreSingleInstanceFactory<T> : SharedKoin_coreInstanceFactory<T>
- (instancetype)initWithBeanDefinition:(SharedKoin_coreBeanDefinition<T> *)beanDefinition __attribute__((swift_name("init(beanDefinition:)"))) __attribute__((objc_designated_initializer));
- (T _Nullable)createContext:(SharedKoin_coreResolutionContext *)context __attribute__((swift_name("create(context:)")));
- (void)dropScope:(SharedKoin_coreScope * _Nullable)scope __attribute__((swift_name("drop(scope:)")));
- (void)dropAll __attribute__((swift_name("dropAll()")));
- (T _Nullable)getContext:(SharedKoin_coreResolutionContext *)context __attribute__((swift_name("get(context:)")));
- (BOOL)isCreatedContext:(SharedKoin_coreResolutionContext * _Nullable)context __attribute__((swift_name("isCreated(context:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreScopeDSL")))
@interface SharedKoin_coreScopeDSL : SharedBase
- (instancetype)initWithScopeQualifier:(id<SharedKoin_coreQualifier>)scopeQualifier module:(SharedKoin_coreModule *)module __attribute__((swift_name("init(scopeQualifier:module:)"))) __attribute__((objc_designated_initializer));
- (SharedKoin_coreKoinDefinition<id> *)factoryQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier definition:(id _Nullable (^)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *))definition __attribute__((swift_name("factory(qualifier:definition:)")));
- (SharedKoin_coreKoinDefinition<id> *)scopedQualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier definition:(id _Nullable (^)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *))definition __attribute__((swift_name("scoped(qualifier:definition:)")));
@property (readonly) SharedKoin_coreModule *module __attribute__((swift_name("module")));
@property (readonly) id<SharedKoin_coreQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("RuntimeAfterVersion")))
@interface SharedRuntimeAfterVersion : SharedBase
- (instancetype)initWithAfterVersion:(int64_t)afterVersion block:(void (^)(id<SharedRuntimeSqlDriver>))block __attribute__((swift_name("init(afterVersion:block:)"))) __attribute__((objc_designated_initializer));
@property (readonly) int64_t afterVersion __attribute__((swift_name("afterVersion")));
@property (readonly) void (^block)(id<SharedRuntimeSqlDriver>) __attribute__((swift_name("block")));
@end

__attribute__((swift_name("KotlinIterator")))
@protocol SharedKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next __attribute__((swift_name("next()")));
@end

__attribute__((swift_name("Ktor_utilsStringValues")))
@protocol SharedKtor_utilsStringValues
@required
- (BOOL)containsName:(NSString *)name __attribute__((swift_name("contains(name:)")));
- (BOOL)containsName:(NSString *)name value:(NSString *)value __attribute__((swift_name("contains(name:value:)")));
- (NSSet<id<SharedKotlinMapEntry>> *)entries __attribute__((swift_name("entries()")));
- (void)forEachBody:(void (^)(NSString *, NSArray<NSString *> *))body __attribute__((swift_name("forEach(body:)")));
- (NSString * _Nullable)getName:(NSString *)name __attribute__((swift_name("get(name:)")));
- (NSArray<NSString *> * _Nullable)getAllName:(NSString *)name __attribute__((swift_name("getAll(name:)")));
- (BOOL)isEmpty __attribute__((swift_name("isEmpty()")));
- (NSSet<NSString *> *)names __attribute__((swift_name("names()")));
@property (readonly) BOOL caseInsensitiveName __attribute__((swift_name("caseInsensitiveName")));
@end

__attribute__((swift_name("Ktor_httpHeaders")))
@protocol SharedKtor_httpHeaders <SharedKtor_utilsStringValues>
@required
@end

__attribute__((swift_name("Ktor_client_coreHttpClientCall")))
@interface SharedKtor_client_coreHttpClientCall : SharedBase <SharedKotlinx_coroutines_coreCoroutineScope>
- (instancetype)initWithClient:(SharedKtor_client_coreHttpClient *)client __attribute__((swift_name("init(client:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithClient:(SharedKtor_client_coreHttpClient *)client requestData:(SharedKtor_client_coreHttpRequestData *)requestData responseData:(SharedKtor_client_coreHttpResponseData *)responseData __attribute__((swift_name("init(client:requestData:responseData:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpClientCallCompanion *companion __attribute__((swift_name("companion")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)bodyInfo:(SharedKtor_utilsTypeInfo *)info completionHandler:(void (^)(id _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("body(info:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)bodyNullableInfo:(SharedKtor_utilsTypeInfo *)info completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("bodyNullable(info:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)getResponseContentWithCompletionHandler:(void (^)(id<SharedKtor_ioByteReadChannel> _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("getResponseContent(completionHandler:)")));
- (NSString *)description __attribute__((swift_name("description()")));

/**
 * @note This property has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
@property (readonly) BOOL allowDoubleReceive __attribute__((swift_name("allowDoubleReceive")));
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property (readonly) SharedKtor_client_coreHttpClient *client __attribute__((swift_name("client")));
@property (readonly) id<SharedKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@property id<SharedKtor_client_coreHttpRequest> request __attribute__((swift_name("request")));
@property SharedKtor_client_coreHttpResponse *response __attribute__((swift_name("response")));
@end

__attribute__((swift_name("Ktor_ioByteReadChannel")))
@protocol SharedKtor_ioByteReadChannel
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)awaitContentWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("awaitContent(completionHandler:)")));
- (BOOL)cancelCause:(SharedKotlinThrowable * _Nullable)cause __attribute__((swift_name("cancel(cause:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)discardMax:(int64_t)max completionHandler:(void (^)(SharedLong * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("discard(max:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)peekToDestination:(SharedKtor_ioMemory *)destination destinationOffset:(int64_t)destinationOffset offset:(int64_t)offset min:(int64_t)min max:(int64_t)max completionHandler:(void (^)(SharedLong * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("peekTo(destination:destinationOffset:offset:min:max:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readAvailableDst:(SharedKtor_ioChunkBuffer *)dst completionHandler:(void (^)(SharedInt * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readAvailable(dst:completionHandler:)")));
- (int32_t)readAvailableMin:(int32_t)min block:(void (^)(SharedKtor_ioBuffer *))block __attribute__((swift_name("readAvailable(min:block:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readAvailableDst:(SharedKotlinByteArray *)dst offset:(int32_t)offset length:(int32_t)length completionHandler:(void (^)(SharedInt * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readAvailable(dst:offset:length:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readAvailableDst:(void *)dst offset:(int32_t)offset length:(int32_t)length completionHandler_:(void (^)(SharedInt * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readAvailable(dst:offset:length:completionHandler_:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readAvailableDst:(void *)dst offset:(int64_t)offset length:(int64_t)length completionHandler__:(void (^)(SharedInt * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readAvailable(dst:offset:length:completionHandler__:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readBooleanWithCompletionHandler:(void (^)(SharedBoolean * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readBoolean(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readByteWithCompletionHandler:(void (^)(SharedByte * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readByte(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readDoubleWithCompletionHandler:(void (^)(SharedDouble * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readDouble(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readFloatWithCompletionHandler:(void (^)(SharedFloat * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readFloat(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readFullyDst:(SharedKtor_ioChunkBuffer *)dst n:(int32_t)n completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("readFully(dst:n:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readFullyDst:(SharedKotlinByteArray *)dst offset:(int32_t)offset length:(int32_t)length completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("readFully(dst:offset:length:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readFullyDst:(void *)dst offset:(int32_t)offset length:(int32_t)length completionHandler_:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("readFully(dst:offset:length:completionHandler_:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readFullyDst:(void *)dst offset:(int64_t)offset length:(int64_t)length completionHandler__:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("readFully(dst:offset:length:completionHandler__:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readIntWithCompletionHandler:(void (^)(SharedInt * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readInt(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readLongWithCompletionHandler:(void (^)(SharedLong * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readLong(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readPacketSize:(int32_t)size completionHandler:(void (^)(SharedKtor_ioByteReadPacket * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readPacket(size:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readRemainingLimit:(int64_t)limit completionHandler:(void (^)(SharedKtor_ioByteReadPacket * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readRemaining(limit:completionHandler:)")));
- (void)readSessionConsumer:(void (^)(id<SharedKtor_ioReadSession>))consumer __attribute__((swift_name("readSession(consumer:)"))) __attribute__((deprecated("Use read { } instead.")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readShortWithCompletionHandler:(void (^)(SharedShort * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readShort(completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readSuspendableSessionConsumer:(id<SharedKotlinSuspendFunction1>)consumer completionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("readSuspendableSession(consumer:completionHandler:)"))) __attribute__((deprecated("Use read { } instead.")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readUTF8LineLimit:(int32_t)limit completionHandler:(void (^)(NSString * _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("readUTF8Line(limit:completionHandler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)readUTF8LineToOut:(id<SharedKotlinAppendable>)out limit:(int32_t)limit completionHandler:(void (^)(SharedBoolean * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("readUTF8LineTo(out:limit:completionHandler:)")));
@property (readonly) int32_t availableForRead __attribute__((swift_name("availableForRead")));
@property (readonly) SharedKotlinThrowable * _Nullable closedCause __attribute__((swift_name("closedCause")));
@property (readonly) BOOL isClosedForRead __attribute__((swift_name("isClosedForRead")));
@property (readonly) BOOL isClosedForWrite __attribute__((swift_name("isClosedForWrite")));
@property (readonly) int64_t totalBytesRead __attribute__((swift_name("totalBytesRead")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsGMTDate")))
@interface SharedKtor_utilsGMTDate : SharedBase <SharedKotlinComparable>
@property (class, readonly, getter=companion) SharedKtor_utilsGMTDateCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(SharedKtor_utilsGMTDate *)other __attribute__((swift_name("compareTo(other:)")));
- (SharedKtor_utilsGMTDate *)doCopySeconds:(int32_t)seconds minutes:(int32_t)minutes hours:(int32_t)hours dayOfWeek:(SharedKtor_utilsWeekDay *)dayOfWeek dayOfMonth:(int32_t)dayOfMonth dayOfYear:(int32_t)dayOfYear month:(SharedKtor_utilsMonth *)month year:(int32_t)year timestamp:(int64_t)timestamp __attribute__((swift_name("doCopy(seconds:minutes:hours:dayOfWeek:dayOfMonth:dayOfYear:month:year:timestamp:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t dayOfMonth __attribute__((swift_name("dayOfMonth")));
@property (readonly) SharedKtor_utilsWeekDay *dayOfWeek __attribute__((swift_name("dayOfWeek")));
@property (readonly) int32_t dayOfYear __attribute__((swift_name("dayOfYear")));
@property (readonly) int32_t hours __attribute__((swift_name("hours")));
@property (readonly) int32_t minutes __attribute__((swift_name("minutes")));
@property (readonly) SharedKtor_utilsMonth *month __attribute__((swift_name("month")));
@property (readonly) int32_t seconds __attribute__((swift_name("seconds")));
@property (readonly) int64_t timestamp __attribute__((swift_name("timestamp")));
@property (readonly) int32_t year __attribute__((swift_name("year")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpStatusCode")))
@interface SharedKtor_httpHttpStatusCode : SharedBase <SharedKotlinComparable>
- (instancetype)initWithValue:(int32_t)value description:(NSString *)description __attribute__((swift_name("init(value:description:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpHttpStatusCodeCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(SharedKtor_httpHttpStatusCode *)other __attribute__((swift_name("compareTo(other:)")));
- (SharedKtor_httpHttpStatusCode *)doCopyValue:(int32_t)value description:(NSString *)description __attribute__((swift_name("doCopy(value:description:)")));
- (SharedKtor_httpHttpStatusCode *)descriptionValue:(NSString *)value __attribute__((swift_name("description(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *description_ __attribute__((swift_name("description_")));
@property (readonly) int32_t value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpProtocolVersion")))
@interface SharedKtor_httpHttpProtocolVersion : SharedBase
- (instancetype)initWithName:(NSString *)name major:(int32_t)major minor:(int32_t)minor __attribute__((swift_name("init(name:major:minor:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpHttpProtocolVersionCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_httpHttpProtocolVersion *)doCopyName:(NSString *)name major:(int32_t)major minor:(int32_t)minor __attribute__((swift_name("doCopy(name:major:minor:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t major __attribute__((swift_name("major")));
@property (readonly) int32_t minor __attribute__((swift_name("minor")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((swift_name("Ktor_client_coreHttpClientEngine")))
@protocol SharedKtor_client_coreHttpClientEngine <SharedKotlinx_coroutines_coreCoroutineScope, SharedKtor_ioCloseable>
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)executeData:(SharedKtor_client_coreHttpRequestData *)data completionHandler:(void (^)(SharedKtor_client_coreHttpResponseData * _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("execute(data:completionHandler:)")));
- (void)installClient:(SharedKtor_client_coreHttpClient *)client __attribute__((swift_name("install(client:)")));
@property (readonly) SharedKtor_client_coreHttpClientEngineConfig *config __attribute__((swift_name("config")));
@property (readonly) SharedKotlinx_coroutines_coreCoroutineDispatcher *dispatcher __attribute__((swift_name("dispatcher")));
@property (readonly) NSSet<id<SharedKtor_client_coreHttpClientEngineCapability>> *supportedCapabilities __attribute__((swift_name("supportedCapabilities")));
@end

__attribute__((swift_name("Ktor_client_coreHttpClientEngineConfig")))
@interface SharedKtor_client_coreHttpClientEngineConfig : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property BOOL pipelining __attribute__((swift_name("pipelining")));
@property SharedKtor_client_coreProxyConfig * _Nullable proxy __attribute__((swift_name("proxy")));
@property int32_t threadsCount __attribute__((swift_name("threadsCount"))) __attribute__((deprecated("The [threadsCount] property is deprecated. The [Dispatchers.IO] is used by default.")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpClientConfig")))
@interface SharedKtor_client_coreHttpClientConfig<T> : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (SharedKtor_client_coreHttpClientConfig<T> *)clone __attribute__((swift_name("clone()")));
- (void)engineBlock:(void (^)(T))block __attribute__((swift_name("engine(block:)")));
- (void)installClient:(SharedKtor_client_coreHttpClient *)client __attribute__((swift_name("install(client:)")));
- (void)installPlugin:(id<SharedKtor_client_coreHttpClientPlugin>)plugin configure:(void (^)(id))configure __attribute__((swift_name("install(plugin:configure:)")));
- (void)installKey:(NSString *)key block:(void (^)(SharedKtor_client_coreHttpClient *))block __attribute__((swift_name("install(key:block:)")));
- (void)plusAssignOther:(SharedKtor_client_coreHttpClientConfig<T> *)other __attribute__((swift_name("plusAssign(other:)")));
@property BOOL developmentMode __attribute__((swift_name("developmentMode")));
@property BOOL expectSuccess __attribute__((swift_name("expectSuccess")));
@property BOOL followRedirects __attribute__((swift_name("followRedirects")));
@property BOOL useDefaultTransformers __attribute__((swift_name("useDefaultTransformers")));
@end

__attribute__((swift_name("Ktor_client_coreHttpClientEngineCapability")))
@protocol SharedKtor_client_coreHttpClientEngineCapability
@required
@end

__attribute__((swift_name("Ktor_utilsAttributes")))
@protocol SharedKtor_utilsAttributes
@required
- (id)computeIfAbsentKey:(SharedKtor_utilsAttributeKey<id> *)key block:(id (^)(void))block __attribute__((swift_name("computeIfAbsent(key:block:)")));
- (BOOL)containsKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("contains(key:)")));
- (id)getKey_:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("get(key_:)")));
- (id _Nullable)getOrNullKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("getOrNull(key:)")));
- (void)putKey:(SharedKtor_utilsAttributeKey<id> *)key value:(id)value __attribute__((swift_name("put(key:value:)")));
- (void)removeKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("remove(key:)")));
- (id)takeKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("take(key:)")));
- (id _Nullable)takeOrNullKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("takeOrNull(key:)")));
@property (readonly) NSArray<SharedKtor_utilsAttributeKey<id> *> *allKeys __attribute__((swift_name("allKeys")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_eventsEvents")))
@interface SharedKtor_eventsEvents : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)raiseDefinition:(SharedKtor_eventsEventDefinition<id> *)definition value:(id _Nullable)value __attribute__((swift_name("raise(definition:value:)")));
- (id<SharedKotlinx_coroutines_coreDisposableHandle>)subscribeDefinition:(SharedKtor_eventsEventDefinition<id> *)definition handler:(void (^)(id _Nullable))handler __attribute__((swift_name("subscribe(definition:handler:)")));
- (void)unsubscribeDefinition:(SharedKtor_eventsEventDefinition<id> *)definition handler:(void (^)(id _Nullable))handler __attribute__((swift_name("unsubscribe(definition:handler:)")));
@end

__attribute__((swift_name("Ktor_utilsPipeline")))
@interface SharedKtor_utilsPipeline<TSubject, TContext> : SharedBase
- (instancetype)initWithPhases:(SharedKotlinArray<SharedKtor_utilsPipelinePhase *> *)phases __attribute__((swift_name("init(phases:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPhase:(SharedKtor_utilsPipelinePhase *)phase interceptors:(NSArray<id<SharedKotlinSuspendFunction2>> *)interceptors __attribute__((swift_name("init(phase:interceptors:)"))) __attribute__((objc_designated_initializer));
- (void)addPhasePhase:(SharedKtor_utilsPipelinePhase *)phase __attribute__((swift_name("addPhase(phase:)")));
- (void)afterIntercepted __attribute__((swift_name("afterIntercepted()")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)executeContext:(TContext)context subject:(TSubject)subject completionHandler:(void (^)(TSubject _Nullable, NSError * _Nullable))completionHandler __attribute__((swift_name("execute(context:subject:completionHandler:)")));
- (void)insertPhaseAfterReference:(SharedKtor_utilsPipelinePhase *)reference phase:(SharedKtor_utilsPipelinePhase *)phase __attribute__((swift_name("insertPhaseAfter(reference:phase:)")));
- (void)insertPhaseBeforeReference:(SharedKtor_utilsPipelinePhase *)reference phase:(SharedKtor_utilsPipelinePhase *)phase __attribute__((swift_name("insertPhaseBefore(reference:phase:)")));
- (void)interceptPhase:(SharedKtor_utilsPipelinePhase *)phase block:(id<SharedKotlinSuspendFunction2>)block __attribute__((swift_name("intercept(phase:block:)")));
- (NSArray<id<SharedKotlinSuspendFunction2>> *)interceptorsForPhasePhase:(SharedKtor_utilsPipelinePhase *)phase __attribute__((swift_name("interceptorsForPhase(phase:)")));
- (void)mergeFrom:(SharedKtor_utilsPipeline<TSubject, TContext> *)from __attribute__((swift_name("merge(from:)")));
- (void)mergePhasesFrom:(SharedKtor_utilsPipeline<TSubject, TContext> *)from __attribute__((swift_name("mergePhases(from:)")));
- (void)resetFromFrom:(SharedKtor_utilsPipeline<TSubject, TContext> *)from __attribute__((swift_name("resetFrom(from:)")));
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property (readonly) BOOL developmentMode __attribute__((swift_name("developmentMode")));
@property (readonly, getter=isEmpty_) BOOL isEmpty __attribute__((swift_name("isEmpty")));
@property (readonly) NSArray<SharedKtor_utilsPipelinePhase *> *items __attribute__((swift_name("items")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpReceivePipeline")))
@interface SharedKtor_client_coreHttpReceivePipeline : SharedKtor_utilsPipeline<SharedKtor_client_coreHttpResponse *, SharedKotlinUnit *>
- (instancetype)initWithDevelopmentMode:(BOOL)developmentMode __attribute__((swift_name("init(developmentMode:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPhases:(SharedKotlinArray<SharedKtor_utilsPipelinePhase *> *)phases __attribute__((swift_name("init(phases:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithPhase:(SharedKtor_utilsPipelinePhase *)phase interceptors:(NSArray<id<SharedKotlinSuspendFunction2>> *)interceptors __attribute__((swift_name("init(phase:interceptors:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpReceivePipelinePhases *companion __attribute__((swift_name("companion")));
@property (readonly) BOOL developmentMode __attribute__((swift_name("developmentMode")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpRequestPipeline")))
@interface SharedKtor_client_coreHttpRequestPipeline : SharedKtor_utilsPipeline<id, SharedKtor_client_coreHttpRequestBuilder *>
- (instancetype)initWithDevelopmentMode:(BOOL)developmentMode __attribute__((swift_name("init(developmentMode:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPhases:(SharedKotlinArray<SharedKtor_utilsPipelinePhase *> *)phases __attribute__((swift_name("init(phases:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithPhase:(SharedKtor_utilsPipelinePhase *)phase interceptors:(NSArray<id<SharedKotlinSuspendFunction2>> *)interceptors __attribute__((swift_name("init(phase:interceptors:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpRequestPipelinePhases *companion __attribute__((swift_name("companion")));
@property (readonly) BOOL developmentMode __attribute__((swift_name("developmentMode")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpResponsePipeline")))
@interface SharedKtor_client_coreHttpResponsePipeline : SharedKtor_utilsPipeline<SharedKtor_client_coreHttpResponseContainer *, SharedKtor_client_coreHttpClientCall *>
- (instancetype)initWithDevelopmentMode:(BOOL)developmentMode __attribute__((swift_name("init(developmentMode:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPhases:(SharedKotlinArray<SharedKtor_utilsPipelinePhase *> *)phases __attribute__((swift_name("init(phases:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithPhase:(SharedKtor_utilsPipelinePhase *)phase interceptors:(NSArray<id<SharedKotlinSuspendFunction2>> *)interceptors __attribute__((swift_name("init(phase:interceptors:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpResponsePipelinePhases *companion __attribute__((swift_name("companion")));
@property (readonly) BOOL developmentMode __attribute__((swift_name("developmentMode")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpSendPipeline")))
@interface SharedKtor_client_coreHttpSendPipeline : SharedKtor_utilsPipeline<id, SharedKtor_client_coreHttpRequestBuilder *>
- (instancetype)initWithDevelopmentMode:(BOOL)developmentMode __attribute__((swift_name("init(developmentMode:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPhases:(SharedKotlinArray<SharedKtor_utilsPipelinePhase *> *)phases __attribute__((swift_name("init(phases:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithPhase:(SharedKtor_utilsPipelinePhase *)phase interceptors:(NSArray<id<SharedKotlinSuspendFunction2>> *)interceptors __attribute__((swift_name("init(phase:interceptors:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpSendPipelinePhases *companion __attribute__((swift_name("companion")));
@property (readonly) BOOL developmentMode __attribute__((swift_name("developmentMode")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreCompositeEncoder")))
@protocol SharedKotlinx_serialization_coreCompositeEncoder
@required
- (void)encodeBooleanElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(BOOL)value __attribute__((swift_name("encodeBooleanElement(descriptor:index:value:)")));
- (void)encodeByteElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(int8_t)value __attribute__((swift_name("encodeByteElement(descriptor:index:value:)")));
- (void)encodeCharElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(unichar)value __attribute__((swift_name("encodeCharElement(descriptor:index:value:)")));
- (void)encodeDoubleElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(double)value __attribute__((swift_name("encodeDoubleElement(descriptor:index:value:)")));
- (void)encodeFloatElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(float)value __attribute__((swift_name("encodeFloatElement(descriptor:index:value:)")));
- (id<SharedKotlinx_serialization_coreEncoder>)encodeInlineElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("encodeInlineElement(descriptor:index:)")));
- (void)encodeIntElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(int32_t)value __attribute__((swift_name("encodeIntElement(descriptor:index:value:)")));
- (void)encodeLongElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(int64_t)value __attribute__((swift_name("encodeLongElement(descriptor:index:value:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (void)encodeNullableSerializableElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index serializer:(id<SharedKotlinx_serialization_coreSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableElement(descriptor:index:serializer:value:)")));
- (void)encodeSerializableElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index serializer:(id<SharedKotlinx_serialization_coreSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableElement(descriptor:index:serializer:value:)")));
- (void)encodeShortElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(int16_t)value __attribute__((swift_name("encodeShortElement(descriptor:index:value:)")));
- (void)encodeStringElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index value:(NSString *)value __attribute__((swift_name("encodeStringElement(descriptor:index:value:)")));
- (void)endStructureDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("endStructure(descriptor:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (BOOL)shouldEncodeElementDefaultDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("shouldEncodeElementDefault(descriptor:index:)")));
@property (readonly) SharedKotlinx_serialization_coreSerializersModule *serializersModule __attribute__((swift_name("serializersModule")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreSerializersModule")))
@interface SharedKotlinx_serialization_coreSerializersModule : SharedBase

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (void)dumpToCollector:(id<SharedKotlinx_serialization_coreSerializersModuleCollector>)collector __attribute__((swift_name("dumpTo(collector:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id<SharedKotlinx_serialization_coreKSerializer> _Nullable)getContextualKClass:(id<SharedKotlinKClass>)kClass typeArgumentsSerializers:(NSArray<id<SharedKotlinx_serialization_coreKSerializer>> *)typeArgumentsSerializers __attribute__((swift_name("getContextual(kClass:typeArgumentsSerializers:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id<SharedKotlinx_serialization_coreSerializationStrategy> _Nullable)getPolymorphicBaseClass:(id<SharedKotlinKClass>)baseClass value:(id)value __attribute__((swift_name("getPolymorphic(baseClass:value:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id<SharedKotlinx_serialization_coreDeserializationStrategy> _Nullable)getPolymorphicBaseClass:(id<SharedKotlinKClass>)baseClass serializedClassName:(NSString * _Nullable)serializedClassName __attribute__((swift_name("getPolymorphic(baseClass:serializedClassName:)")));
@end

__attribute__((swift_name("KotlinAnnotation")))
@protocol SharedKotlinAnnotation
@required
@end


/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
__attribute__((swift_name("Kotlinx_serialization_coreSerialKind")))
@interface SharedKotlinx_serialization_coreSerialKind : SharedBase
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("Kotlinx_serialization_coreCompositeDecoder")))
@protocol SharedKotlinx_serialization_coreCompositeDecoder
@required
- (BOOL)decodeBooleanElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeBooleanElement(descriptor:index:)")));
- (int8_t)decodeByteElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeByteElement(descriptor:index:)")));
- (unichar)decodeCharElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeCharElement(descriptor:index:)")));
- (int32_t)decodeCollectionSizeDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("decodeCollectionSize(descriptor:)")));
- (double)decodeDoubleElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeDoubleElement(descriptor:index:)")));
- (int32_t)decodeElementIndexDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("decodeElementIndex(descriptor:)")));
- (float)decodeFloatElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeFloatElement(descriptor:index:)")));
- (id<SharedKotlinx_serialization_coreDecoder>)decodeInlineElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeInlineElement(descriptor:index:)")));
- (int32_t)decodeIntElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeIntElement(descriptor:index:)")));
- (int64_t)decodeLongElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeLongElement(descriptor:index:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (id _Nullable)decodeNullableSerializableElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index deserializer:(id<SharedKotlinx_serialization_coreDeserializationStrategy>)deserializer previousValue:(id _Nullable)previousValue __attribute__((swift_name("decodeNullableSerializableElement(descriptor:index:deserializer:previousValue:)")));

/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
- (BOOL)decodeSequentially __attribute__((swift_name("decodeSequentially()")));
- (id _Nullable)decodeSerializableElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index deserializer:(id<SharedKotlinx_serialization_coreDeserializationStrategy>)deserializer previousValue:(id _Nullable)previousValue __attribute__((swift_name("decodeSerializableElement(descriptor:index:deserializer:previousValue:)")));
- (int16_t)decodeShortElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeShortElement(descriptor:index:)")));
- (NSString *)decodeStringElementDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor index:(int32_t)index __attribute__((swift_name("decodeStringElement(descriptor:index:)")));
- (void)endStructureDescriptor:(id<SharedKotlinx_serialization_coreSerialDescriptor>)descriptor __attribute__((swift_name("endStructure(descriptor:)")));
@property (readonly) SharedKotlinx_serialization_coreSerializersModule *serializersModule __attribute__((swift_name("serializersModule")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinNothing")))
@interface SharedKotlinNothing : SharedBase
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeMonth")))
@interface SharedKotlinx_datetimeMonth : SharedKotlinEnum<SharedKotlinx_datetimeMonth *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKotlinx_datetimeMonth *january __attribute__((swift_name("january")));
@property (class, readonly) SharedKotlinx_datetimeMonth *february __attribute__((swift_name("february")));
@property (class, readonly) SharedKotlinx_datetimeMonth *march __attribute__((swift_name("march")));
@property (class, readonly) SharedKotlinx_datetimeMonth *april __attribute__((swift_name("april")));
@property (class, readonly) SharedKotlinx_datetimeMonth *may __attribute__((swift_name("may")));
@property (class, readonly) SharedKotlinx_datetimeMonth *june __attribute__((swift_name("june")));
@property (class, readonly) SharedKotlinx_datetimeMonth *july __attribute__((swift_name("july")));
@property (class, readonly) SharedKotlinx_datetimeMonth *august __attribute__((swift_name("august")));
@property (class, readonly) SharedKotlinx_datetimeMonth *september __attribute__((swift_name("september")));
@property (class, readonly) SharedKotlinx_datetimeMonth *october __attribute__((swift_name("october")));
@property (class, readonly) SharedKotlinx_datetimeMonth *november __attribute__((swift_name("november")));
@property (class, readonly) SharedKotlinx_datetimeMonth *december __attribute__((swift_name("december")));
+ (SharedKotlinArray<SharedKotlinx_datetimeMonth *> *)values __attribute__((swift_name("values()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeDayOfWeek")))
@interface SharedKotlinx_datetimeDayOfWeek : SharedKotlinEnum<SharedKotlinx_datetimeDayOfWeek *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *monday __attribute__((swift_name("monday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *tuesday __attribute__((swift_name("tuesday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *wednesday __attribute__((swift_name("wednesday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *thursday __attribute__((swift_name("thursday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *friday __attribute__((swift_name("friday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *saturday __attribute__((swift_name("saturday")));
@property (class, readonly) SharedKotlinx_datetimeDayOfWeek *sunday __attribute__((swift_name("sunday")));
+ (SharedKotlinArray<SharedKotlinx_datetimeDayOfWeek *> *)values __attribute__((swift_name("values()")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.Serializable(with=NormalClass(value=kotlinx/datetime/serializers/LocalTimeIso8601Serializer))
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalTime")))
@interface SharedKotlinx_datetimeLocalTime : SharedBase <SharedKotlinComparable>
- (instancetype)initWithHour:(int32_t)hour minute:(int32_t)minute second:(int32_t)second nanosecond:(int32_t)nanosecond __attribute__((swift_name("init(hour:minute:second:nanosecond:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinx_datetimeLocalTimeCompanion *companion __attribute__((swift_name("companion")));
- (int32_t)compareToOther:(SharedKotlinx_datetimeLocalTime *)other __attribute__((swift_name("compareTo(other:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (int32_t)toMillisecondOfDay __attribute__((swift_name("toMillisecondOfDay()")));
- (int64_t)toNanosecondOfDay __attribute__((swift_name("toNanosecondOfDay()")));
- (int32_t)toSecondOfDay __attribute__((swift_name("toSecondOfDay()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t hour __attribute__((swift_name("hour")));
@property (readonly) int32_t minute __attribute__((swift_name("minute")));
@property (readonly) int32_t nanosecond __attribute__((swift_name("nanosecond")));
@property (readonly) int32_t second __attribute__((swift_name("second")));
@end

__attribute__((swift_name("Koin_coreScopeCallback")))
@protocol SharedKoin_coreScopeCallback
@required
- (void)onScopeCloseScope:(SharedKoin_coreScope *)scope __attribute__((swift_name("onScopeClose(scope:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreLevel")))
@interface SharedKoin_coreLevel : SharedKotlinEnum<SharedKoin_coreLevel *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKoin_coreLevel *debug __attribute__((swift_name("debug")));
@property (class, readonly) SharedKoin_coreLevel *info __attribute__((swift_name("info")));
@property (class, readonly) SharedKoin_coreLevel *warning __attribute__((swift_name("warning")));
@property (class, readonly) SharedKoin_coreLevel *error __attribute__((swift_name("error")));
@property (class, readonly) SharedKoin_coreLevel *none __attribute__((swift_name("none")));
+ (SharedKotlinArray<SharedKoin_coreLevel *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedKoin_coreLevel *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((swift_name("Koin_coreKoinExtension")))
@protocol SharedKoin_coreKoinExtension
@required
- (void)onClose __attribute__((swift_name("onClose()")));
- (void)onRegisterKoin:(SharedKoin_coreKoin *)koin __attribute__((swift_name("onRegister(koin:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreScopeRegistry.Companion")))
@interface SharedKoin_coreScopeRegistryCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKoin_coreScopeRegistryCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreKoinApplication.Companion")))
@interface SharedKoin_coreKoinApplicationCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKoin_coreKoinApplicationCompanion *shared __attribute__((swift_name("shared")));
- (SharedKoin_coreKoinApplication *)doInit __attribute__((swift_name("doInit()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinByteArray")))
@interface SharedKotlinByteArray : SharedBase
+ (instancetype)arrayWithSize:(int32_t)size __attribute__((swift_name("init(size:)")));
+ (instancetype)arrayWithSize:(int32_t)size init:(SharedByte *(^)(SharedInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (int8_t)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (SharedKotlinByteIterator *)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(int8_t)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreBeanDefinition")))
@interface SharedKoin_coreBeanDefinition<T> : SharedBase
- (instancetype)initWithScopeQualifier:(id<SharedKoin_coreQualifier>)scopeQualifier primaryType:(id<SharedKotlinKClass>)primaryType qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier definition:(T _Nullable (^)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *))definition kind:(SharedKoin_coreKind *)kind secondaryTypes:(NSArray<id<SharedKotlinKClass>> *)secondaryTypes __attribute__((swift_name("init(scopeQualifier:primaryType:qualifier:definition:kind:secondaryTypes:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (BOOL)hasTypeClazz:(id<SharedKotlinKClass>)clazz __attribute__((swift_name("hasType(clazz:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (BOOL)isClazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier scopeDefinition:(id<SharedKoin_coreQualifier>)scopeDefinition __attribute__((swift_name("is(clazz:qualifier:scopeDefinition:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property SharedKoin_coreCallbacks<T> *callbacks __attribute__((swift_name("callbacks")));
@property (readonly) T _Nullable (^definition)(SharedKoin_coreScope *, SharedKoin_coreParametersHolder *) __attribute__((swift_name("definition")));
@property (readonly) SharedKoin_coreKind *kind __attribute__((swift_name("kind")));
@property (readonly) id<SharedKotlinKClass> primaryType __attribute__((swift_name("primaryType")));
@property id<SharedKoin_coreQualifier> _Nullable qualifier __attribute__((swift_name("qualifier")));
@property (readonly) id<SharedKoin_coreQualifier> scopeQualifier __attribute__((swift_name("scopeQualifier")));
@property NSArray<id<SharedKotlinKClass>> *secondaryTypes __attribute__((swift_name("secondaryTypes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreInstanceFactoryCompanion")))
@interface SharedKoin_coreInstanceFactoryCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKoin_coreInstanceFactoryCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) NSString *ERROR_SEPARATOR __attribute__((swift_name("ERROR_SEPARATOR")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreResolutionContext")))
@interface SharedKoin_coreResolutionContext : SharedBase
- (instancetype)initWithLogger:(SharedKoin_coreLogger *)logger scope:(SharedKoin_coreScope *)scope clazz:(id<SharedKotlinKClass>)clazz qualifier:(id<SharedKoin_coreQualifier> _Nullable)qualifier parameters:(SharedKoin_coreParametersHolder * _Nullable)parameters __attribute__((swift_name("init(logger:scope:clazz:qualifier:parameters:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<SharedKotlinKClass> clazz __attribute__((swift_name("clazz")));
@property (readonly) NSString *debugTag __attribute__((swift_name("debugTag")));
@property (readonly) SharedKoin_coreLogger *logger __attribute__((swift_name("logger")));
@property (readonly) SharedKoin_coreParametersHolder * _Nullable parameters __attribute__((swift_name("parameters")));
@property (readonly) id<SharedKoin_coreQualifier> _Nullable qualifier __attribute__((swift_name("qualifier")));
@property (readonly) SharedKoin_coreScope *scope __attribute__((swift_name("scope")));
@end

__attribute__((swift_name("KotlinMapEntry")))
@protocol SharedKotlinMapEntry
@required
@property (readonly) id _Nullable key __attribute__((swift_name("key")));
@property (readonly) id _Nullable value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpRequestData")))
@interface SharedKtor_client_coreHttpRequestData : SharedBase
- (instancetype)initWithUrl:(SharedKtor_httpUrl *)url method:(SharedKtor_httpHttpMethod *)method headers:(id<SharedKtor_httpHeaders>)headers body:(SharedKtor_httpOutgoingContent *)body executionContext:(id<SharedKotlinx_coroutines_coreJob>)executionContext attributes:(id<SharedKtor_utilsAttributes>)attributes __attribute__((swift_name("init(url:method:headers:body:executionContext:attributes:)"))) __attribute__((objc_designated_initializer));
- (id _Nullable)getCapabilityOrNullKey:(id<SharedKtor_client_coreHttpClientEngineCapability>)key __attribute__((swift_name("getCapabilityOrNull(key:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property (readonly) SharedKtor_httpOutgoingContent *body __attribute__((swift_name("body")));
@property (readonly) id<SharedKotlinx_coroutines_coreJob> executionContext __attribute__((swift_name("executionContext")));
@property (readonly) id<SharedKtor_httpHeaders> headers __attribute__((swift_name("headers")));
@property (readonly) SharedKtor_httpHttpMethod *method __attribute__((swift_name("method")));
@property (readonly) SharedKtor_httpUrl *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpResponseData")))
@interface SharedKtor_client_coreHttpResponseData : SharedBase
- (instancetype)initWithStatusCode:(SharedKtor_httpHttpStatusCode *)statusCode requestTime:(SharedKtor_utilsGMTDate *)requestTime headers:(id<SharedKtor_httpHeaders>)headers version:(SharedKtor_httpHttpProtocolVersion *)version body:(id)body callContext:(id<SharedKotlinCoroutineContext>)callContext __attribute__((swift_name("init(statusCode:requestTime:headers:version:body:callContext:)"))) __attribute__((objc_designated_initializer));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id body __attribute__((swift_name("body")));
@property (readonly) id<SharedKotlinCoroutineContext> callContext __attribute__((swift_name("callContext")));
@property (readonly) id<SharedKtor_httpHeaders> headers __attribute__((swift_name("headers")));
@property (readonly) SharedKtor_utilsGMTDate *requestTime __attribute__((swift_name("requestTime")));
@property (readonly) SharedKtor_utilsGMTDate *responseTime __attribute__((swift_name("responseTime")));
@property (readonly) SharedKtor_httpHttpStatusCode *statusCode __attribute__((swift_name("statusCode")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *version __attribute__((swift_name("version")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpClientCall.Companion")))
@interface SharedKtor_client_coreHttpClientCallCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpClientCallCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsAttributeKey<id> *CustomResponse __attribute__((swift_name("CustomResponse"))) __attribute__((unavailable("This is going to be removed. Please file a ticket with clarification why and what for do you need it.")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsTypeInfo")))
@interface SharedKtor_utilsTypeInfo : SharedBase
- (instancetype)initWithType:(id<SharedKotlinKClass>)type reifiedType:(id<SharedKotlinKType>)reifiedType kotlinType:(id<SharedKotlinKType> _Nullable)kotlinType __attribute__((swift_name("init(type:reifiedType:kotlinType:)"))) __attribute__((objc_designated_initializer));
- (SharedKtor_utilsTypeInfo *)doCopyType:(id<SharedKotlinKClass>)type reifiedType:(id<SharedKotlinKType>)reifiedType kotlinType:(id<SharedKotlinKType> _Nullable)kotlinType __attribute__((swift_name("doCopy(type:reifiedType:kotlinType:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<SharedKotlinKType> _Nullable kotlinType __attribute__((swift_name("kotlinType")));
@property (readonly) id<SharedKotlinKType> reifiedType __attribute__((swift_name("reifiedType")));
@property (readonly) id<SharedKotlinKClass> type __attribute__((swift_name("type")));
@end

__attribute__((swift_name("Ktor_client_coreHttpRequest")))
@protocol SharedKtor_client_coreHttpRequest <SharedKtor_httpHttpMessage, SharedKotlinx_coroutines_coreCoroutineScope>
@required
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property (readonly) SharedKtor_client_coreHttpClientCall *call __attribute__((swift_name("call")));
@property (readonly) SharedKtor_httpOutgoingContent *content __attribute__((swift_name("content")));
@property (readonly) SharedKtor_httpHttpMethod *method __attribute__((swift_name("method")));
@property (readonly) SharedKtor_httpUrl *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioMemory")))
@interface SharedKtor_ioMemory : SharedBase
- (instancetype)initWithPointer:(void *)pointer size:(int64_t)size __attribute__((swift_name("init(pointer:size:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_ioMemoryCompanion *companion __attribute__((swift_name("companion")));
- (void)doCopyToDestination:(SharedKtor_ioMemory *)destination offset:(int32_t)offset length:(int32_t)length destinationOffset:(int32_t)destinationOffset __attribute__((swift_name("doCopyTo(destination:offset:length:destinationOffset:)")));
- (void)doCopyToDestination:(SharedKtor_ioMemory *)destination offset:(int64_t)offset length:(int64_t)length destinationOffset_:(int64_t)destinationOffset __attribute__((swift_name("doCopyTo(destination:offset:length:destinationOffset_:)")));
- (int8_t)loadAtIndex:(int32_t)index __attribute__((swift_name("loadAt(index:)")));
- (int8_t)loadAtIndex_:(int64_t)index __attribute__((swift_name("loadAt(index_:)")));
- (SharedKtor_ioMemory *)sliceOffset:(int32_t)offset length:(int32_t)length __attribute__((swift_name("slice(offset:length:)")));
- (SharedKtor_ioMemory *)sliceOffset:(int64_t)offset length_:(int64_t)length __attribute__((swift_name("slice(offset:length_:)")));
- (void)storeAtIndex:(int32_t)index value:(int8_t)value __attribute__((swift_name("storeAt(index:value:)")));
- (void)storeAtIndex:(int64_t)index value_:(int8_t)value __attribute__((swift_name("storeAt(index:value_:)")));
@property (readonly) void *pointer __attribute__((swift_name("pointer")));
@property (readonly) int64_t size __attribute__((swift_name("size")));
@property (readonly) int32_t size32 __attribute__((swift_name("size32")));
@end

__attribute__((swift_name("Ktor_ioBuffer")))
@interface SharedKtor_ioBuffer : SharedBase
- (instancetype)initWithMemory:(SharedKtor_ioMemory *)memory __attribute__((swift_name("init(memory:)"))) __attribute__((objc_designated_initializer)) __attribute__((deprecated("\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")));
@property (class, readonly, getter=companion) SharedKtor_ioBufferCompanion *companion __attribute__((swift_name("companion")));
- (void)commitWrittenCount:(int32_t)count __attribute__((swift_name("commitWritten(count:)")));
- (void)discardExactCount:(int32_t)count __attribute__((swift_name("discardExact(count:)")));
- (SharedKtor_ioBuffer *)duplicate __attribute__((swift_name("duplicate()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)duplicateToCopy:(SharedKtor_ioBuffer *)copy __attribute__((swift_name("duplicateTo(copy:)")));
- (int8_t)readByte __attribute__((swift_name("readByte()")));
- (void)reserveEndGapEndGap:(int32_t)endGap __attribute__((swift_name("reserveEndGap(endGap:)")));
- (void)reserveStartGapStartGap:(int32_t)startGap __attribute__((swift_name("reserveStartGap(startGap:)")));
- (void)reset __attribute__((swift_name("reset()")));
- (void)resetForRead __attribute__((swift_name("resetForRead()")));
- (void)resetForWrite __attribute__((swift_name("resetForWrite()")));
- (void)resetForWriteLimit:(int32_t)limit __attribute__((swift_name("resetForWrite(limit:)")));
- (void)rewindCount:(int32_t)count __attribute__((swift_name("rewind(count:)")));
- (NSString *)description __attribute__((swift_name("description()")));
- (int32_t)tryPeekByte __attribute__((swift_name("tryPeekByte()")));
- (int32_t)tryReadByte __attribute__((swift_name("tryReadByte()")));
- (void)writeByteValue:(int8_t)value __attribute__((swift_name("writeByte(value:)")));
@property (readonly) int32_t capacity __attribute__((swift_name("capacity")));
@property (readonly) int32_t endGap __attribute__((swift_name("endGap")));
@property (readonly) int32_t limit __attribute__((swift_name("limit")));
@property (readonly) SharedKtor_ioMemory *memory __attribute__((swift_name("memory")));
@property (readonly) int32_t readPosition __attribute__((swift_name("readPosition")));
@property (readonly) int32_t readRemaining __attribute__((swift_name("readRemaining")));
@property (readonly) int32_t startGap __attribute__((swift_name("startGap")));
@property (readonly) int32_t writePosition __attribute__((swift_name("writePosition")));
@property (readonly) int32_t writeRemaining __attribute__((swift_name("writeRemaining")));
@end

__attribute__((swift_name("Ktor_ioChunkBuffer")))
@interface SharedKtor_ioChunkBuffer : SharedKtor_ioBuffer
- (instancetype)initWithMemory:(SharedKtor_ioMemory *)memory origin:(SharedKtor_ioChunkBuffer * _Nullable)origin parentPool:(id<SharedKtor_ioObjectPool> _Nullable)parentPool __attribute__((swift_name("init(memory:origin:parentPool:)"))) __attribute__((objc_designated_initializer)) __attribute__((deprecated("\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")));
- (instancetype)initWithMemory:(SharedKtor_ioMemory *)memory __attribute__((swift_name("init(memory:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_ioChunkBufferCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_ioChunkBuffer * _Nullable)cleanNext __attribute__((swift_name("cleanNext()")));
- (SharedKtor_ioChunkBuffer *)duplicate __attribute__((swift_name("duplicate()")));
- (void)releasePool:(id<SharedKtor_ioObjectPool>)pool __attribute__((swift_name("release(pool:)")));
- (void)reset __attribute__((swift_name("reset()")));
@property (getter=next_) SharedKtor_ioChunkBuffer * _Nullable next __attribute__((swift_name("next")));
@property (readonly) SharedKtor_ioChunkBuffer * _Nullable origin __attribute__((swift_name("origin")));
@property (readonly) int32_t referenceCount __attribute__((swift_name("referenceCount")));
@end

__attribute__((swift_name("Ktor_ioInput")))
@interface SharedKtor_ioInput : SharedBase <SharedKtor_ioCloseable>
- (instancetype)initWithHead:(SharedKtor_ioChunkBuffer *)head remaining:(int64_t)remaining pool:(id<SharedKtor_ioObjectPool>)pool __attribute__((swift_name("init(head:remaining:pool:)"))) __attribute__((objc_designated_initializer)) __attribute__((deprecated("\n    We're migrating to the new kotlinx-io library.\n    This declaration is deprecated and will be removed in Ktor 4.0.0\n    If you have any problems with migration, please contact us in \n    https://youtrack.jetbrains.com/issue/KTOR-6030/Migrate-to-new-kotlinx.io-library\n    ")));
@property (class, readonly, getter=companion) SharedKtor_ioInputCompanion *companion __attribute__((swift_name("companion")));
- (BOOL)canRead __attribute__((swift_name("canRead()")));
- (void)close __attribute__((swift_name("close()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)closeSource __attribute__((swift_name("closeSource()")));
- (int32_t)discardN:(int32_t)n __attribute__((swift_name("discard(n:)")));
- (int64_t)discardN_:(int64_t)n __attribute__((swift_name("discard(n_:)")));
- (void)discardExactN:(int32_t)n __attribute__((swift_name("discardExact(n:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (SharedKtor_ioChunkBuffer * _Nullable)fill __attribute__((swift_name("fill()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (int32_t)fillDestination:(SharedKtor_ioMemory *)destination offset:(int32_t)offset length:(int32_t)length __attribute__((swift_name("fill(destination:offset:length:)")));
- (BOOL)hasBytesN:(int32_t)n __attribute__((swift_name("hasBytes(n:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)markNoMoreChunksAvailable __attribute__((swift_name("markNoMoreChunksAvailable()")));
- (int32_t)peekToBuffer:(SharedKtor_ioChunkBuffer *)buffer __attribute__((swift_name("peekTo(buffer:)")));
- (int64_t)peekToDestination:(SharedKtor_ioMemory *)destination destinationOffset:(int64_t)destinationOffset offset:(int64_t)offset min:(int64_t)min max:(int64_t)max __attribute__((swift_name("peekTo(destination:destinationOffset:offset:min:max:)")));
- (int8_t)readByte __attribute__((swift_name("readByte()")));
- (NSString *)readTextMin:(int32_t)min max:(int32_t)max __attribute__((swift_name("readText(min:max:)")));
- (int32_t)readTextOut:(id<SharedKotlinAppendable>)out min:(int32_t)min max:(int32_t)max __attribute__((swift_name("readText(out:min:max:)")));
- (NSString *)readTextExactExactCharacters:(int32_t)exactCharacters __attribute__((swift_name("readTextExact(exactCharacters:)")));
- (void)readTextExactOut:(id<SharedKotlinAppendable>)out exactCharacters:(int32_t)exactCharacters __attribute__((swift_name("readTextExact(out:exactCharacters:)")));
- (void)release_ __attribute__((swift_name("release()")));
- (int32_t)tryPeek __attribute__((swift_name("tryPeek()")));
@property (readonly) BOOL endOfInput __attribute__((swift_name("endOfInput")));
@property (readonly) id<SharedKtor_ioObjectPool> pool __attribute__((swift_name("pool")));
@property (readonly) int64_t remaining __attribute__((swift_name("remaining")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioByteReadPacket")))
@interface SharedKtor_ioByteReadPacket : SharedKtor_ioInput
- (instancetype)initWithHead:(SharedKtor_ioChunkBuffer *)head pool:(id<SharedKtor_ioObjectPool>)pool __attribute__((swift_name("init(head:pool:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithHead:(SharedKtor_ioChunkBuffer *)head remaining:(int64_t)remaining pool:(id<SharedKtor_ioObjectPool>)pool __attribute__((swift_name("init(head:remaining:pool:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_ioByteReadPacketCompanion *companion __attribute__((swift_name("companion")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)closeSource __attribute__((swift_name("closeSource()")));
- (SharedKtor_ioByteReadPacket *)doCopy __attribute__((swift_name("doCopy()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (SharedKtor_ioChunkBuffer * _Nullable)fill __attribute__((swift_name("fill()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (int32_t)fillDestination:(SharedKtor_ioMemory *)destination offset:(int32_t)offset length:(int32_t)length __attribute__((swift_name("fill(destination:offset:length:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((swift_name("Ktor_ioReadSession")))
@protocol SharedKtor_ioReadSession
@required
- (int32_t)discardN:(int32_t)n __attribute__((swift_name("discard(n:)")));
- (SharedKtor_ioChunkBuffer * _Nullable)requestAtLeast:(int32_t)atLeast __attribute__((swift_name("request(atLeast:)")));
@property (readonly) int32_t availableForRead __attribute__((swift_name("availableForRead")));
@end

__attribute__((swift_name("KotlinAppendable")))
@protocol SharedKotlinAppendable
@required
- (id<SharedKotlinAppendable>)appendValue:(unichar)value __attribute__((swift_name("append(value:)")));
- (id<SharedKotlinAppendable>)appendValue_:(id _Nullable)value __attribute__((swift_name("append(value_:)")));
- (id<SharedKotlinAppendable>)appendValue:(id _Nullable)value startIndex:(int32_t)startIndex endIndex:(int32_t)endIndex __attribute__((swift_name("append(value:startIndex:endIndex:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsGMTDate.Companion")))
@interface SharedKtor_utilsGMTDateCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_utilsGMTDateCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsGMTDate *START __attribute__((swift_name("START")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsWeekDay")))
@interface SharedKtor_utilsWeekDay : SharedKotlinEnum<SharedKtor_utilsWeekDay *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_utilsWeekDayCompanion *companion __attribute__((swift_name("companion")));
@property (class, readonly) SharedKtor_utilsWeekDay *monday __attribute__((swift_name("monday")));
@property (class, readonly) SharedKtor_utilsWeekDay *tuesday __attribute__((swift_name("tuesday")));
@property (class, readonly) SharedKtor_utilsWeekDay *wednesday __attribute__((swift_name("wednesday")));
@property (class, readonly) SharedKtor_utilsWeekDay *thursday __attribute__((swift_name("thursday")));
@property (class, readonly) SharedKtor_utilsWeekDay *friday __attribute__((swift_name("friday")));
@property (class, readonly) SharedKtor_utilsWeekDay *saturday __attribute__((swift_name("saturday")));
@property (class, readonly) SharedKtor_utilsWeekDay *sunday __attribute__((swift_name("sunday")));
+ (SharedKotlinArray<SharedKtor_utilsWeekDay *> *)values __attribute__((swift_name("values()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsMonth")))
@interface SharedKtor_utilsMonth : SharedKotlinEnum<SharedKtor_utilsMonth *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_utilsMonthCompanion *companion __attribute__((swift_name("companion")));
@property (class, readonly) SharedKtor_utilsMonth *january __attribute__((swift_name("january")));
@property (class, readonly) SharedKtor_utilsMonth *february __attribute__((swift_name("february")));
@property (class, readonly) SharedKtor_utilsMonth *march __attribute__((swift_name("march")));
@property (class, readonly) SharedKtor_utilsMonth *april __attribute__((swift_name("april")));
@property (class, readonly) SharedKtor_utilsMonth *may __attribute__((swift_name("may")));
@property (class, readonly) SharedKtor_utilsMonth *june __attribute__((swift_name("june")));
@property (class, readonly) SharedKtor_utilsMonth *july __attribute__((swift_name("july")));
@property (class, readonly) SharedKtor_utilsMonth *august __attribute__((swift_name("august")));
@property (class, readonly) SharedKtor_utilsMonth *september __attribute__((swift_name("september")));
@property (class, readonly) SharedKtor_utilsMonth *october __attribute__((swift_name("october")));
@property (class, readonly) SharedKtor_utilsMonth *november __attribute__((swift_name("november")));
@property (class, readonly) SharedKtor_utilsMonth *december __attribute__((swift_name("december")));
+ (SharedKotlinArray<SharedKtor_utilsMonth *> *)values __attribute__((swift_name("values()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpStatusCode.Companion")))
@interface SharedKtor_httpHttpStatusCodeCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpHttpStatusCodeCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_httpHttpStatusCode *)fromValueValue:(int32_t)value __attribute__((swift_name("fromValue(value:)")));
@property (readonly) SharedKtor_httpHttpStatusCode *Accepted __attribute__((swift_name("Accepted")));
@property (readonly) SharedKtor_httpHttpStatusCode *BadGateway __attribute__((swift_name("BadGateway")));
@property (readonly) SharedKtor_httpHttpStatusCode *BadRequest __attribute__((swift_name("BadRequest")));
@property (readonly) SharedKtor_httpHttpStatusCode *Conflict __attribute__((swift_name("Conflict")));
@property (readonly) SharedKtor_httpHttpStatusCode *Continue __attribute__((swift_name("Continue")));
@property (readonly) SharedKtor_httpHttpStatusCode *Created __attribute__((swift_name("Created")));
@property (readonly) SharedKtor_httpHttpStatusCode *ExpectationFailed __attribute__((swift_name("ExpectationFailed")));
@property (readonly) SharedKtor_httpHttpStatusCode *FailedDependency __attribute__((swift_name("FailedDependency")));
@property (readonly) SharedKtor_httpHttpStatusCode *Forbidden __attribute__((swift_name("Forbidden")));
@property (readonly) SharedKtor_httpHttpStatusCode *Found __attribute__((swift_name("Found")));
@property (readonly) SharedKtor_httpHttpStatusCode *GatewayTimeout __attribute__((swift_name("GatewayTimeout")));
@property (readonly) SharedKtor_httpHttpStatusCode *Gone __attribute__((swift_name("Gone")));
@property (readonly) SharedKtor_httpHttpStatusCode *InsufficientStorage __attribute__((swift_name("InsufficientStorage")));
@property (readonly) SharedKtor_httpHttpStatusCode *InternalServerError __attribute__((swift_name("InternalServerError")));
@property (readonly) SharedKtor_httpHttpStatusCode *LengthRequired __attribute__((swift_name("LengthRequired")));
@property (readonly) SharedKtor_httpHttpStatusCode *Locked __attribute__((swift_name("Locked")));
@property (readonly) SharedKtor_httpHttpStatusCode *MethodNotAllowed __attribute__((swift_name("MethodNotAllowed")));
@property (readonly) SharedKtor_httpHttpStatusCode *MovedPermanently __attribute__((swift_name("MovedPermanently")));
@property (readonly) SharedKtor_httpHttpStatusCode *MultiStatus __attribute__((swift_name("MultiStatus")));
@property (readonly) SharedKtor_httpHttpStatusCode *MultipleChoices __attribute__((swift_name("MultipleChoices")));
@property (readonly) SharedKtor_httpHttpStatusCode *NoContent __attribute__((swift_name("NoContent")));
@property (readonly) SharedKtor_httpHttpStatusCode *NonAuthoritativeInformation __attribute__((swift_name("NonAuthoritativeInformation")));
@property (readonly) SharedKtor_httpHttpStatusCode *NotAcceptable __attribute__((swift_name("NotAcceptable")));
@property (readonly) SharedKtor_httpHttpStatusCode *NotFound __attribute__((swift_name("NotFound")));
@property (readonly) SharedKtor_httpHttpStatusCode *NotImplemented __attribute__((swift_name("NotImplemented")));
@property (readonly) SharedKtor_httpHttpStatusCode *NotModified __attribute__((swift_name("NotModified")));
@property (readonly) SharedKtor_httpHttpStatusCode *OK __attribute__((swift_name("OK")));
@property (readonly) SharedKtor_httpHttpStatusCode *PartialContent __attribute__((swift_name("PartialContent")));
@property (readonly) SharedKtor_httpHttpStatusCode *PayloadTooLarge __attribute__((swift_name("PayloadTooLarge")));
@property (readonly) SharedKtor_httpHttpStatusCode *PaymentRequired __attribute__((swift_name("PaymentRequired")));
@property (readonly) SharedKtor_httpHttpStatusCode *PermanentRedirect __attribute__((swift_name("PermanentRedirect")));
@property (readonly) SharedKtor_httpHttpStatusCode *PreconditionFailed __attribute__((swift_name("PreconditionFailed")));
@property (readonly) SharedKtor_httpHttpStatusCode *Processing __attribute__((swift_name("Processing")));
@property (readonly) SharedKtor_httpHttpStatusCode *ProxyAuthenticationRequired __attribute__((swift_name("ProxyAuthenticationRequired")));
@property (readonly) SharedKtor_httpHttpStatusCode *RequestHeaderFieldTooLarge __attribute__((swift_name("RequestHeaderFieldTooLarge")));
@property (readonly) SharedKtor_httpHttpStatusCode *RequestTimeout __attribute__((swift_name("RequestTimeout")));
@property (readonly) SharedKtor_httpHttpStatusCode *RequestURITooLong __attribute__((swift_name("RequestURITooLong")));
@property (readonly) SharedKtor_httpHttpStatusCode *RequestedRangeNotSatisfiable __attribute__((swift_name("RequestedRangeNotSatisfiable")));
@property (readonly) SharedKtor_httpHttpStatusCode *ResetContent __attribute__((swift_name("ResetContent")));
@property (readonly) SharedKtor_httpHttpStatusCode *SeeOther __attribute__((swift_name("SeeOther")));
@property (readonly) SharedKtor_httpHttpStatusCode *ServiceUnavailable __attribute__((swift_name("ServiceUnavailable")));
@property (readonly) SharedKtor_httpHttpStatusCode *SwitchProxy __attribute__((swift_name("SwitchProxy")));
@property (readonly) SharedKtor_httpHttpStatusCode *SwitchingProtocols __attribute__((swift_name("SwitchingProtocols")));
@property (readonly) SharedKtor_httpHttpStatusCode *TemporaryRedirect __attribute__((swift_name("TemporaryRedirect")));
@property (readonly) SharedKtor_httpHttpStatusCode *TooEarly __attribute__((swift_name("TooEarly")));
@property (readonly) SharedKtor_httpHttpStatusCode *TooManyRequests __attribute__((swift_name("TooManyRequests")));
@property (readonly) SharedKtor_httpHttpStatusCode *Unauthorized __attribute__((swift_name("Unauthorized")));
@property (readonly) SharedKtor_httpHttpStatusCode *UnprocessableEntity __attribute__((swift_name("UnprocessableEntity")));
@property (readonly) SharedKtor_httpHttpStatusCode *UnsupportedMediaType __attribute__((swift_name("UnsupportedMediaType")));
@property (readonly) SharedKtor_httpHttpStatusCode *UpgradeRequired __attribute__((swift_name("UpgradeRequired")));
@property (readonly) SharedKtor_httpHttpStatusCode *UseProxy __attribute__((swift_name("UseProxy")));
@property (readonly) SharedKtor_httpHttpStatusCode *VariantAlsoNegotiates __attribute__((swift_name("VariantAlsoNegotiates")));
@property (readonly) SharedKtor_httpHttpStatusCode *VersionNotSupported __attribute__((swift_name("VersionNotSupported")));
@property (readonly) NSArray<SharedKtor_httpHttpStatusCode *> *allStatusCodes __attribute__((swift_name("allStatusCodes")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpProtocolVersion.Companion")))
@interface SharedKtor_httpHttpProtocolVersionCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpHttpProtocolVersionCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_httpHttpProtocolVersion *)fromValueName:(NSString *)name major:(int32_t)major minor:(int32_t)minor __attribute__((swift_name("fromValue(name:major:minor:)")));
- (SharedKtor_httpHttpProtocolVersion *)parseValue:(id)value __attribute__((swift_name("parse(value:)")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *HTTP_1_0 __attribute__((swift_name("HTTP_1_0")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *HTTP_1_1 __attribute__((swift_name("HTTP_1_1")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *HTTP_2_0 __attribute__((swift_name("HTTP_2_0")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *QUIC __attribute__((swift_name("QUIC")));
@property (readonly) SharedKtor_httpHttpProtocolVersion *SPDY_3 __attribute__((swift_name("SPDY_3")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.3")
*/
__attribute__((swift_name("KotlinAbstractCoroutineContextElement")))
@interface SharedKotlinAbstractCoroutineContextElement : SharedBase <SharedKotlinCoroutineContextElement>
- (instancetype)initWithKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<SharedKotlinCoroutineContextKey> key __attribute__((swift_name("key")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.3")
*/
__attribute__((swift_name("KotlinContinuationInterceptor")))
@protocol SharedKotlinContinuationInterceptor <SharedKotlinCoroutineContextElement>
@required
- (id<SharedKotlinContinuation>)interceptContinuationContinuation:(id<SharedKotlinContinuation>)continuation __attribute__((swift_name("interceptContinuation(continuation:)")));
- (void)releaseInterceptedContinuationContinuation:(id<SharedKotlinContinuation>)continuation __attribute__((swift_name("releaseInterceptedContinuation(continuation:)")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineDispatcher")))
@interface SharedKotlinx_coroutines_coreCoroutineDispatcher : SharedKotlinAbstractCoroutineContextElement <SharedKotlinContinuationInterceptor>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithKey:(id<SharedKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKotlinx_coroutines_coreCoroutineDispatcherKey *companion __attribute__((swift_name("companion")));
- (void)dispatchContext:(id<SharedKotlinCoroutineContext>)context block:(id<SharedKotlinx_coroutines_coreRunnable>)block __attribute__((swift_name("dispatch(context:block:)")));
- (void)dispatchYieldContext:(id<SharedKotlinCoroutineContext>)context block:(id<SharedKotlinx_coroutines_coreRunnable>)block __attribute__((swift_name("dispatchYield(context:block:)")));
- (id<SharedKotlinContinuation>)interceptContinuationContinuation:(id<SharedKotlinContinuation>)continuation __attribute__((swift_name("interceptContinuation(continuation:)")));
- (BOOL)isDispatchNeededContext:(id<SharedKotlinCoroutineContext>)context __attribute__((swift_name("isDispatchNeeded(context:)")));

/**
 * @note annotations
 *   kotlinx.coroutines.ExperimentalCoroutinesApi
*/
- (SharedKotlinx_coroutines_coreCoroutineDispatcher *)limitedParallelismParallelism:(int32_t)parallelism __attribute__((swift_name("limitedParallelism(parallelism:)")));
- (SharedKotlinx_coroutines_coreCoroutineDispatcher *)plusOther:(SharedKotlinx_coroutines_coreCoroutineDispatcher *)other __attribute__((swift_name("plus(other:)"))) __attribute__((unavailable("Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")));
- (void)releaseInterceptedContinuationContinuation:(id<SharedKotlinContinuation>)continuation __attribute__((swift_name("releaseInterceptedContinuation(continuation:)")));
- (NSString *)description __attribute__((swift_name("description()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreProxyConfig")))
@interface SharedKtor_client_coreProxyConfig : SharedBase
- (instancetype)initWithUrl:(SharedKtor_httpUrl *)url __attribute__((swift_name("init(url:)"))) __attribute__((objc_designated_initializer));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKtor_httpUrl *url __attribute__((swift_name("url")));
@end

__attribute__((swift_name("Ktor_client_coreHttpClientPlugin")))
@protocol SharedKtor_client_coreHttpClientPlugin
@required
- (void)installPlugin:(id)plugin scope:(SharedKtor_client_coreHttpClient *)scope __attribute__((swift_name("install(plugin:scope:)")));
- (id)prepareBlock:(void (^)(id))block __attribute__((swift_name("prepare(block:)")));
@property (readonly) SharedKtor_utilsAttributeKey<id> *key __attribute__((swift_name("key")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsAttributeKey")))
@interface SharedKtor_utilsAttributeKey<T> : SharedBase
- (instancetype)initWithName:(NSString *)name __attribute__((swift_name("init(name:)"))) __attribute__((objc_designated_initializer));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((swift_name("Ktor_eventsEventDefinition")))
@interface SharedKtor_eventsEventDefinition<T> : SharedBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreDisposableHandle")))
@protocol SharedKotlinx_coroutines_coreDisposableHandle
@required
- (void)dispose __attribute__((swift_name("dispose()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsPipelinePhase")))
@interface SharedKtor_utilsPipelinePhase : SharedBase
- (instancetype)initWithName:(NSString *)name __attribute__((swift_name("init(name:)"))) __attribute__((objc_designated_initializer));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((swift_name("KotlinSuspendFunction2")))
@protocol SharedKotlinSuspendFunction2 <SharedKotlinFunction>
@required

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)invokeP1:(id _Nullable)p1 p2:(id _Nullable)p2 completionHandler:(void (^)(id _Nullable_result, NSError * _Nullable))completionHandler __attribute__((swift_name("invoke(p1:p2:completionHandler:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpReceivePipeline.Phases")))
@interface SharedKtor_client_coreHttpReceivePipelinePhases : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)phases __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpReceivePipelinePhases *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsPipelinePhase *After __attribute__((swift_name("After")));
@property (readonly) SharedKtor_utilsPipelinePhase *Before __attribute__((swift_name("Before")));
@property (readonly) SharedKtor_utilsPipelinePhase *State __attribute__((swift_name("State")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpRequestPipeline.Phases")))
@interface SharedKtor_client_coreHttpRequestPipelinePhases : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)phases __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpRequestPipelinePhases *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsPipelinePhase *Before __attribute__((swift_name("Before")));
@property (readonly) SharedKtor_utilsPipelinePhase *Render __attribute__((swift_name("Render")));
@property (readonly) SharedKtor_utilsPipelinePhase *Send __attribute__((swift_name("Send")));
@property (readonly) SharedKtor_utilsPipelinePhase *State __attribute__((swift_name("State")));
@property (readonly) SharedKtor_utilsPipelinePhase *Transform __attribute__((swift_name("Transform")));
@end

__attribute__((swift_name("Ktor_httpHttpMessageBuilder")))
@protocol SharedKtor_httpHttpMessageBuilder
@required
@property (readonly) SharedKtor_httpHeadersBuilder *headers __attribute__((swift_name("headers")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpRequestBuilder")))
@interface SharedKtor_client_coreHttpRequestBuilder : SharedBase <SharedKtor_httpHttpMessageBuilder>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@property (class, readonly, getter=companion) SharedKtor_client_coreHttpRequestBuilderCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_client_coreHttpRequestData *)build __attribute__((swift_name("build()")));
- (id _Nullable)getCapabilityOrNullKey:(id<SharedKtor_client_coreHttpClientEngineCapability>)key __attribute__((swift_name("getCapabilityOrNull(key:)")));
- (void)setAttributesBlock:(void (^)(id<SharedKtor_utilsAttributes>))block __attribute__((swift_name("setAttributes(block:)")));
- (void)setCapabilityKey:(id<SharedKtor_client_coreHttpClientEngineCapability>)key capability:(id)capability __attribute__((swift_name("setCapability(key:capability:)")));
- (SharedKtor_client_coreHttpRequestBuilder *)takeFromBuilder:(SharedKtor_client_coreHttpRequestBuilder *)builder __attribute__((swift_name("takeFrom(builder:)")));
- (SharedKtor_client_coreHttpRequestBuilder *)takeFromWithExecutionContextBuilder:(SharedKtor_client_coreHttpRequestBuilder *)builder __attribute__((swift_name("takeFromWithExecutionContext(builder:)")));
- (void)urlBlock:(void (^)(SharedKtor_httpURLBuilder *, SharedKtor_httpURLBuilder *))block __attribute__((swift_name("url(block:)")));
@property (readonly) id<SharedKtor_utilsAttributes> attributes __attribute__((swift_name("attributes")));
@property id body __attribute__((swift_name("body")));
@property SharedKtor_utilsTypeInfo * _Nullable bodyType __attribute__((swift_name("bodyType")));
@property (readonly) id<SharedKotlinx_coroutines_coreJob> executionContext __attribute__((swift_name("executionContext")));
@property (readonly) SharedKtor_httpHeadersBuilder *headers __attribute__((swift_name("headers")));
@property SharedKtor_httpHttpMethod *method __attribute__((swift_name("method")));
@property (readonly) SharedKtor_httpURLBuilder *url __attribute__((swift_name("url")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpResponsePipeline.Phases")))
@interface SharedKtor_client_coreHttpResponsePipelinePhases : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)phases __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpResponsePipelinePhases *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsPipelinePhase *After __attribute__((swift_name("After")));
@property (readonly) SharedKtor_utilsPipelinePhase *Parse __attribute__((swift_name("Parse")));
@property (readonly) SharedKtor_utilsPipelinePhase *Receive __attribute__((swift_name("Receive")));
@property (readonly) SharedKtor_utilsPipelinePhase *State __attribute__((swift_name("State")));
@property (readonly) SharedKtor_utilsPipelinePhase *Transform __attribute__((swift_name("Transform")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpResponseContainer")))
@interface SharedKtor_client_coreHttpResponseContainer : SharedBase
- (instancetype)initWithExpectedType:(SharedKtor_utilsTypeInfo *)expectedType response:(id)response __attribute__((swift_name("init(expectedType:response:)"))) __attribute__((objc_designated_initializer));
- (SharedKtor_client_coreHttpResponseContainer *)doCopyExpectedType:(SharedKtor_utilsTypeInfo *)expectedType response:(id)response __attribute__((swift_name("doCopy(expectedType:response:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) SharedKtor_utilsTypeInfo *expectedType __attribute__((swift_name("expectedType")));
@property (readonly) id response __attribute__((swift_name("response")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpSendPipeline.Phases")))
@interface SharedKtor_client_coreHttpSendPipelinePhases : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)phases __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpSendPipelinePhases *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_utilsPipelinePhase *Before __attribute__((swift_name("Before")));
@property (readonly) SharedKtor_utilsPipelinePhase *Engine __attribute__((swift_name("Engine")));
@property (readonly) SharedKtor_utilsPipelinePhase *Monitoring __attribute__((swift_name("Monitoring")));
@property (readonly) SharedKtor_utilsPipelinePhase *Receive __attribute__((swift_name("Receive")));
@property (readonly) SharedKtor_utilsPipelinePhase *State __attribute__((swift_name("State")));
@end


/**
 * @note annotations
 *   kotlinx.serialization.ExperimentalSerializationApi
*/
__attribute__((swift_name("Kotlinx_serialization_coreSerializersModuleCollector")))
@protocol SharedKotlinx_serialization_coreSerializersModuleCollector
@required
- (void)contextualKClass:(id<SharedKotlinKClass>)kClass provider:(id<SharedKotlinx_serialization_coreKSerializer> (^)(NSArray<id<SharedKotlinx_serialization_coreKSerializer>> *))provider __attribute__((swift_name("contextual(kClass:provider:)")));
- (void)contextualKClass:(id<SharedKotlinKClass>)kClass serializer:(id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("contextual(kClass:serializer:)")));
- (void)polymorphicBaseClass:(id<SharedKotlinKClass>)baseClass actualClass:(id<SharedKotlinKClass>)actualClass actualSerializer:(id<SharedKotlinx_serialization_coreKSerializer>)actualSerializer __attribute__((swift_name("polymorphic(baseClass:actualClass:actualSerializer:)")));
- (void)polymorphicDefaultBaseClass:(id<SharedKotlinKClass>)baseClass defaultDeserializerProvider:(id<SharedKotlinx_serialization_coreDeserializationStrategy> _Nullable (^)(NSString * _Nullable))defaultDeserializerProvider __attribute__((swift_name("polymorphicDefault(baseClass:defaultDeserializerProvider:)"))) __attribute__((deprecated("Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer")));
- (void)polymorphicDefaultDeserializerBaseClass:(id<SharedKotlinKClass>)baseClass defaultDeserializerProvider:(id<SharedKotlinx_serialization_coreDeserializationStrategy> _Nullable (^)(NSString * _Nullable))defaultDeserializerProvider __attribute__((swift_name("polymorphicDefaultDeserializer(baseClass:defaultDeserializerProvider:)")));
- (void)polymorphicDefaultSerializerBaseClass:(id<SharedKotlinKClass>)baseClass defaultSerializerProvider:(id<SharedKotlinx_serialization_coreSerializationStrategy> _Nullable (^)(id))defaultSerializerProvider __attribute__((swift_name("polymorphicDefaultSerializer(baseClass:defaultSerializerProvider:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_datetimeLocalTime.Companion")))
@interface SharedKotlinx_datetimeLocalTimeCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinx_datetimeLocalTimeCompanion *shared __attribute__((swift_name("shared")));
- (SharedKotlinx_datetimeLocalTime *)fromMillisecondOfDayMillisecondOfDay:(int32_t)millisecondOfDay __attribute__((swift_name("fromMillisecondOfDay(millisecondOfDay:)")));
- (SharedKotlinx_datetimeLocalTime *)fromNanosecondOfDayNanosecondOfDay:(int64_t)nanosecondOfDay __attribute__((swift_name("fromNanosecondOfDay(nanosecondOfDay:)")));
- (SharedKotlinx_datetimeLocalTime *)fromSecondOfDaySecondOfDay:(int32_t)secondOfDay __attribute__((swift_name("fromSecondOfDay(secondOfDay:)")));
- (SharedKotlinx_datetimeLocalTime *)parseIsoString:(NSString *)isoString __attribute__((swift_name("parse(isoString:)")));
- (id<SharedKotlinx_serialization_coreKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end

__attribute__((swift_name("KotlinByteIterator")))
@interface SharedKotlinByteIterator : SharedBase <SharedKotlinIterator>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (SharedByte *)next __attribute__((swift_name("next()")));
- (int8_t)nextByte __attribute__((swift_name("nextByte()")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreKind")))
@interface SharedKoin_coreKind : SharedKotlinEnum<SharedKoin_coreKind *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKoin_coreKind *singleton __attribute__((swift_name("singleton")));
@property (class, readonly) SharedKoin_coreKind *factory __attribute__((swift_name("factory")));
@property (class, readonly) SharedKoin_coreKind *scoped __attribute__((swift_name("scoped")));
+ (SharedKotlinArray<SharedKoin_coreKind *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedKoin_coreKind *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Koin_coreCallbacks")))
@interface SharedKoin_coreCallbacks<T> : SharedBase
- (instancetype)initWithOnClose:(void (^ _Nullable)(T _Nullable))onClose __attribute__((swift_name("init(onClose:)"))) __attribute__((objc_designated_initializer));
- (SharedKoin_coreCallbacks<T> *)doCopyOnClose:(void (^ _Nullable)(T _Nullable))onClose __attribute__((swift_name("doCopy(onClose:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) void (^ _Nullable onClose)(T _Nullable) __attribute__((swift_name("onClose")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpUrl")))
@interface SharedKtor_httpUrl : SharedBase
@property (class, readonly, getter=companion) SharedKtor_httpUrlCompanion *companion __attribute__((swift_name("companion")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *encodedFragment __attribute__((swift_name("encodedFragment")));
@property (readonly) NSString * _Nullable encodedPassword __attribute__((swift_name("encodedPassword")));
@property (readonly) NSString *encodedPath __attribute__((swift_name("encodedPath")));
@property (readonly) NSString *encodedPathAndQuery __attribute__((swift_name("encodedPathAndQuery")));
@property (readonly) NSString *encodedQuery __attribute__((swift_name("encodedQuery")));
@property (readonly) NSString * _Nullable encodedUser __attribute__((swift_name("encodedUser")));
@property (readonly) NSString *fragment __attribute__((swift_name("fragment")));
@property (readonly) NSString *host __attribute__((swift_name("host")));
@property (readonly) id<SharedKtor_httpParameters> parameters __attribute__((swift_name("parameters")));
@property (readonly) NSString * _Nullable password __attribute__((swift_name("password")));
@property (readonly) NSArray<NSString *> *pathSegments __attribute__((swift_name("pathSegments")));
@property (readonly) int32_t port __attribute__((swift_name("port")));
@property (readonly) SharedKtor_httpURLProtocol *protocol __attribute__((swift_name("protocol")));
@property (readonly) int32_t specifiedPort __attribute__((swift_name("specifiedPort")));
@property (readonly) BOOL trailingQuery __attribute__((swift_name("trailingQuery")));
@property (readonly) NSString * _Nullable user __attribute__((swift_name("user")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpMethod")))
@interface SharedKtor_httpHttpMethod : SharedBase
- (instancetype)initWithValue:(NSString *)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpHttpMethodCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_httpHttpMethod *)doCopyValue:(NSString *)value __attribute__((swift_name("doCopy(value:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((swift_name("Ktor_httpOutgoingContent")))
@interface SharedKtor_httpOutgoingContent : SharedBase
- (id _Nullable)getPropertyKey:(SharedKtor_utilsAttributeKey<id> *)key __attribute__((swift_name("getProperty(key:)")));
- (void)setPropertyKey:(SharedKtor_utilsAttributeKey<id> *)key value:(id _Nullable)value __attribute__((swift_name("setProperty(key:value:)")));
- (id<SharedKtor_httpHeaders> _Nullable)trailers __attribute__((swift_name("trailers()")));
@property (readonly) SharedLong * _Nullable contentLength __attribute__((swift_name("contentLength")));
@property (readonly) SharedKtor_httpContentType * _Nullable contentType __attribute__((swift_name("contentType")));
@property (readonly) id<SharedKtor_httpHeaders> headers __attribute__((swift_name("headers")));
@property (readonly) SharedKtor_httpHttpStatusCode * _Nullable status __attribute__((swift_name("status")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreJob")))
@protocol SharedKotlinx_coroutines_coreJob <SharedKotlinCoroutineContextElement>
@required
- (id<SharedKotlinx_coroutines_coreChildHandle>)attachChildChild:(id<SharedKotlinx_coroutines_coreChildJob>)child __attribute__((swift_name("attachChild(child:)")));
- (void)cancelCause_:(SharedKotlinCancellationException * _Nullable)cause __attribute__((swift_name("cancel(cause_:)")));
- (SharedKotlinCancellationException *)getCancellationException __attribute__((swift_name("getCancellationException()")));
- (id<SharedKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionHandler:(void (^)(SharedKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(handler:)")));
- (id<SharedKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionOnCancelling:(BOOL)onCancelling invokeImmediately:(BOOL)invokeImmediately handler:(void (^)(SharedKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(onCancelling:invokeImmediately:handler:)")));

/**
 * @note This method converts instances of CancellationException to errors.
 * Other uncaught Kotlin exceptions are fatal.
*/
- (void)joinWithCompletionHandler:(void (^)(NSError * _Nullable))completionHandler __attribute__((swift_name("join(completionHandler:)")));
- (id<SharedKotlinx_coroutines_coreJob>)plusOther_:(id<SharedKotlinx_coroutines_coreJob>)other __attribute__((swift_name("plus(other_:)"))) __attribute__((unavailable("Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")));
- (BOOL)start __attribute__((swift_name("start()")));
@property (readonly) id<SharedKotlinSequence> children __attribute__((swift_name("children")));
@property (readonly) BOOL isActive __attribute__((swift_name("isActive")));
@property (readonly) BOOL isCancelled __attribute__((swift_name("isCancelled")));
@property (readonly) BOOL isCompleted __attribute__((swift_name("isCompleted")));
@property (readonly) id<SharedKotlinx_coroutines_coreSelectClause0> onJoin __attribute__((swift_name("onJoin")));

/**
 * @note annotations
 *   kotlinx.coroutines.ExperimentalCoroutinesApi
*/
@property (readonly) id<SharedKotlinx_coroutines_coreJob> _Nullable parent __attribute__((swift_name("parent")));
@end

__attribute__((swift_name("KotlinKType")))
@protocol SharedKotlinKType
@required

/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
@property (readonly) NSArray<SharedKotlinKTypeProjection *> *arguments __attribute__((swift_name("arguments")));

/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
@property (readonly) id<SharedKotlinKClassifier> _Nullable classifier __attribute__((swift_name("classifier")));
@property (readonly) BOOL isMarkedNullable __attribute__((swift_name("isMarkedNullable")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioMemory.Companion")))
@interface SharedKtor_ioMemoryCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_ioMemoryCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_ioMemory *Empty __attribute__((swift_name("Empty")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioBuffer.Companion")))
@interface SharedKtor_ioBufferCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_ioBufferCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_ioBuffer *Empty __attribute__((swift_name("Empty")));
@property (readonly) int32_t ReservedSize __attribute__((swift_name("ReservedSize")));
@end

__attribute__((swift_name("Ktor_ioObjectPool")))
@protocol SharedKtor_ioObjectPool <SharedKtor_ioCloseable>
@required
- (id)borrow __attribute__((swift_name("borrow()")));
- (void)dispose __attribute__((swift_name("dispose()")));
- (void)recycleInstance:(id)instance __attribute__((swift_name("recycle(instance:)")));
@property (readonly) int32_t capacity __attribute__((swift_name("capacity")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioChunkBuffer.Companion")))
@interface SharedKtor_ioChunkBufferCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_ioChunkBufferCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_ioChunkBuffer *Empty __attribute__((swift_name("Empty")));
@property (readonly) id<SharedKtor_ioObjectPool> EmptyPool __attribute__((swift_name("EmptyPool")));
@property (readonly) id<SharedKtor_ioObjectPool> Pool __attribute__((swift_name("Pool")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioInput.Companion")))
@interface SharedKtor_ioInputCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_ioInputCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_ioByteReadPacket.Companion")))
@interface SharedKtor_ioByteReadPacketCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_ioByteReadPacketCompanion *shared __attribute__((swift_name("shared")));
@property (readonly) SharedKtor_ioByteReadPacket *Empty __attribute__((swift_name("Empty")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsWeekDay.Companion")))
@interface SharedKtor_utilsWeekDayCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_utilsWeekDayCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_utilsWeekDay *)fromOrdinal:(int32_t)ordinal __attribute__((swift_name("from(ordinal:)")));
- (SharedKtor_utilsWeekDay *)fromValue:(NSString *)value __attribute__((swift_name("from(value:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_utilsMonth.Companion")))
@interface SharedKtor_utilsMonthCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_utilsMonthCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_utilsMonth *)fromOrdinal:(int32_t)ordinal __attribute__((swift_name("from(ordinal:)")));
- (SharedKtor_utilsMonth *)fromValue:(NSString *)value __attribute__((swift_name("from(value:)")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.3")
*/
__attribute__((swift_name("KotlinContinuation")))
@protocol SharedKotlinContinuation
@required
- (void)resumeWithResult:(id _Nullable)result __attribute__((swift_name("resumeWith(result:)")));
@property (readonly) id<SharedKotlinCoroutineContext> context __attribute__((swift_name("context")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.3")
 *   kotlin.ExperimentalStdlibApi
*/
__attribute__((swift_name("KotlinAbstractCoroutineContextKey")))
@interface SharedKotlinAbstractCoroutineContextKey<B, E> : SharedBase <SharedKotlinCoroutineContextKey>
- (instancetype)initWithBaseKey:(id<SharedKotlinCoroutineContextKey>)baseKey safeCast:(E _Nullable (^)(id<SharedKotlinCoroutineContextElement>))safeCast __attribute__((swift_name("init(baseKey:safeCast:)"))) __attribute__((objc_designated_initializer));
@end


/**
 * @note annotations
 *   kotlin.ExperimentalStdlibApi
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineDispatcher.Key")))
@interface SharedKotlinx_coroutines_coreCoroutineDispatcherKey : SharedKotlinAbstractCoroutineContextKey<id<SharedKotlinContinuationInterceptor>, SharedKotlinx_coroutines_coreCoroutineDispatcher *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithBaseKey:(id<SharedKotlinCoroutineContextKey>)baseKey safeCast:(id<SharedKotlinCoroutineContextElement> _Nullable (^)(id<SharedKotlinCoroutineContextElement>))safeCast __attribute__((swift_name("init(baseKey:safeCast:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)key __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinx_coroutines_coreCoroutineDispatcherKey *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreRunnable")))
@protocol SharedKotlinx_coroutines_coreRunnable
@required
- (void)run __attribute__((swift_name("run()")));
@end

__attribute__((swift_name("Ktor_utilsStringValuesBuilder")))
@protocol SharedKtor_utilsStringValuesBuilder
@required
- (void)appendName:(NSString *)name value:(NSString *)value __attribute__((swift_name("append(name:value:)")));
- (void)appendAllStringValues:(id<SharedKtor_utilsStringValues>)stringValues __attribute__((swift_name("appendAll(stringValues:)")));
- (void)appendAllName:(NSString *)name values:(id)values __attribute__((swift_name("appendAll(name:values:)")));
- (void)appendMissingStringValues:(id<SharedKtor_utilsStringValues>)stringValues __attribute__((swift_name("appendMissing(stringValues:)")));
- (void)appendMissingName:(NSString *)name values:(id)values __attribute__((swift_name("appendMissing(name:values:)")));
- (id<SharedKtor_utilsStringValues>)build __attribute__((swift_name("build()")));
- (void)clear __attribute__((swift_name("clear()")));
- (BOOL)containsName:(NSString *)name __attribute__((swift_name("contains(name:)")));
- (BOOL)containsName:(NSString *)name value:(NSString *)value __attribute__((swift_name("contains(name:value:)")));
- (NSSet<id<SharedKotlinMapEntry>> *)entries __attribute__((swift_name("entries()")));
- (NSString * _Nullable)getName:(NSString *)name __attribute__((swift_name("get(name:)")));
- (NSArray<NSString *> * _Nullable)getAllName:(NSString *)name __attribute__((swift_name("getAll(name:)")));
- (BOOL)isEmpty __attribute__((swift_name("isEmpty()")));
- (NSSet<NSString *> *)names __attribute__((swift_name("names()")));
- (void)removeName:(NSString *)name __attribute__((swift_name("remove(name:)")));
- (BOOL)removeName:(NSString *)name value:(NSString *)value __attribute__((swift_name("remove(name:value:)")));
- (void)removeKeysWithNoEntries __attribute__((swift_name("removeKeysWithNoEntries()")));
- (void)setName:(NSString *)name value:(NSString *)value __attribute__((swift_name("set(name:value:)")));
@property (readonly) BOOL caseInsensitiveName __attribute__((swift_name("caseInsensitiveName")));
@end

__attribute__((swift_name("Ktor_utilsStringValuesBuilderImpl")))
@interface SharedKtor_utilsStringValuesBuilderImpl : SharedBase <SharedKtor_utilsStringValuesBuilder>
- (instancetype)initWithCaseInsensitiveName:(BOOL)caseInsensitiveName size:(int32_t)size __attribute__((swift_name("init(caseInsensitiveName:size:)"))) __attribute__((objc_designated_initializer));
- (void)appendName:(NSString *)name value:(NSString *)value __attribute__((swift_name("append(name:value:)")));
- (void)appendAllStringValues:(id<SharedKtor_utilsStringValues>)stringValues __attribute__((swift_name("appendAll(stringValues:)")));
- (void)appendAllName:(NSString *)name values:(id)values __attribute__((swift_name("appendAll(name:values:)")));
- (void)appendMissingStringValues:(id<SharedKtor_utilsStringValues>)stringValues __attribute__((swift_name("appendMissing(stringValues:)")));
- (void)appendMissingName:(NSString *)name values:(id)values __attribute__((swift_name("appendMissing(name:values:)")));
- (id<SharedKtor_utilsStringValues>)build __attribute__((swift_name("build()")));
- (void)clear __attribute__((swift_name("clear()")));
- (BOOL)containsName:(NSString *)name __attribute__((swift_name("contains(name:)")));
- (BOOL)containsName:(NSString *)name value:(NSString *)value __attribute__((swift_name("contains(name:value:)")));
- (NSSet<id<SharedKotlinMapEntry>> *)entries __attribute__((swift_name("entries()")));
- (NSString * _Nullable)getName:(NSString *)name __attribute__((swift_name("get(name:)")));
- (NSArray<NSString *> * _Nullable)getAllName:(NSString *)name __attribute__((swift_name("getAll(name:)")));
- (BOOL)isEmpty __attribute__((swift_name("isEmpty()")));
- (NSSet<NSString *> *)names __attribute__((swift_name("names()")));
- (void)removeName:(NSString *)name __attribute__((swift_name("remove(name:)")));
- (BOOL)removeName:(NSString *)name value:(NSString *)value __attribute__((swift_name("remove(name:value:)")));
- (void)removeKeysWithNoEntries __attribute__((swift_name("removeKeysWithNoEntries()")));
- (void)setName:(NSString *)name value:(NSString *)value __attribute__((swift_name("set(name:value:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)validateNameName:(NSString *)name __attribute__((swift_name("validateName(name:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)validateValueValue:(NSString *)value __attribute__((swift_name("validateValue(value:)")));
@property (readonly) BOOL caseInsensitiveName __attribute__((swift_name("caseInsensitiveName")));

/**
 * @note This property has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
@property (readonly, getter=values_) SharedMutableDictionary<NSString *, NSMutableArray<NSString *> *> *values __attribute__((swift_name("values")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHeadersBuilder")))
@interface SharedKtor_httpHeadersBuilder : SharedKtor_utilsStringValuesBuilderImpl
- (instancetype)initWithSize:(int32_t)size __attribute__((swift_name("init(size:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCaseInsensitiveName:(BOOL)caseInsensitiveName size:(int32_t)size __attribute__((swift_name("init(caseInsensitiveName:size:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (id<SharedKtor_httpHeaders>)build __attribute__((swift_name("build()")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)validateNameName:(NSString *)name __attribute__((swift_name("validateName(name:)")));

/**
 * @note This method has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
- (void)validateValueValue:(NSString *)value __attribute__((swift_name("validateValue(value:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_client_coreHttpRequestBuilder.Companion")))
@interface SharedKtor_client_coreHttpRequestBuilderCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_client_coreHttpRequestBuilderCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpURLBuilder")))
@interface SharedKtor_httpURLBuilder : SharedBase
- (instancetype)initWithProtocol:(SharedKtor_httpURLProtocol *)protocol host:(NSString *)host port:(int32_t)port user:(NSString * _Nullable)user password:(NSString * _Nullable)password pathSegments:(NSArray<NSString *> *)pathSegments parameters:(id<SharedKtor_httpParameters>)parameters fragment:(NSString *)fragment trailingQuery:(BOOL)trailingQuery __attribute__((swift_name("init(protocol:host:port:user:password:pathSegments:parameters:fragment:trailingQuery:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpURLBuilderCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_httpUrl *)build __attribute__((swift_name("build()")));
- (NSString *)buildString __attribute__((swift_name("buildString()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property NSString *encodedFragment __attribute__((swift_name("encodedFragment")));
@property id<SharedKtor_httpParametersBuilder> encodedParameters __attribute__((swift_name("encodedParameters")));
@property NSString * _Nullable encodedPassword __attribute__((swift_name("encodedPassword")));
@property NSArray<NSString *> *encodedPathSegments __attribute__((swift_name("encodedPathSegments")));
@property NSString * _Nullable encodedUser __attribute__((swift_name("encodedUser")));
@property NSString *fragment __attribute__((swift_name("fragment")));
@property NSString *host __attribute__((swift_name("host")));
@property (readonly) id<SharedKtor_httpParametersBuilder> parameters __attribute__((swift_name("parameters")));
@property NSString * _Nullable password __attribute__((swift_name("password")));
@property NSArray<NSString *> *pathSegments __attribute__((swift_name("pathSegments")));
@property int32_t port __attribute__((swift_name("port")));
@property SharedKtor_httpURLProtocol *protocol __attribute__((swift_name("protocol")));
@property BOOL trailingQuery __attribute__((swift_name("trailingQuery")));
@property NSString * _Nullable user __attribute__((swift_name("user")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpUrl.Companion")))
@interface SharedKtor_httpUrlCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpUrlCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("Ktor_httpParameters")))
@protocol SharedKtor_httpParameters <SharedKtor_utilsStringValues>
@required
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpURLProtocol")))
@interface SharedKtor_httpURLProtocol : SharedBase
- (instancetype)initWithName:(NSString *)name defaultPort:(int32_t)defaultPort __attribute__((swift_name("init(name:defaultPort:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpURLProtocolCompanion *companion __attribute__((swift_name("companion")));
- (SharedKtor_httpURLProtocol *)doCopyName:(NSString *)name defaultPort:(int32_t)defaultPort __attribute__((swift_name("doCopy(name:defaultPort:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) int32_t defaultPort __attribute__((swift_name("defaultPort")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHttpMethod.Companion")))
@interface SharedKtor_httpHttpMethodCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpHttpMethodCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_httpHttpMethod *)parseMethod:(NSString *)method __attribute__((swift_name("parse(method:)")));
@property (readonly) NSArray<SharedKtor_httpHttpMethod *> *DefaultMethods __attribute__((swift_name("DefaultMethods")));
@property (readonly) SharedKtor_httpHttpMethod *Delete __attribute__((swift_name("Delete")));
@property (readonly) SharedKtor_httpHttpMethod *Get __attribute__((swift_name("Get")));
@property (readonly) SharedKtor_httpHttpMethod *Head __attribute__((swift_name("Head")));
@property (readonly) SharedKtor_httpHttpMethod *Options __attribute__((swift_name("Options")));
@property (readonly) SharedKtor_httpHttpMethod *Patch __attribute__((swift_name("Patch")));
@property (readonly) SharedKtor_httpHttpMethod *Post __attribute__((swift_name("Post")));
@property (readonly) SharedKtor_httpHttpMethod *Put __attribute__((swift_name("Put")));
@end

__attribute__((swift_name("Ktor_httpHeaderValueWithParameters")))
@interface SharedKtor_httpHeaderValueWithParameters : SharedBase
- (instancetype)initWithContent:(NSString *)content parameters:(NSArray<SharedKtor_httpHeaderValueParam *> *)parameters __attribute__((swift_name("init(content:parameters:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKtor_httpHeaderValueWithParametersCompanion *companion __attribute__((swift_name("companion")));
- (NSString * _Nullable)parameterName:(NSString *)name __attribute__((swift_name("parameter(name:)")));
- (NSString *)description __attribute__((swift_name("description()")));

/**
 * @note This property has protected visibility in Kotlin source and is intended only for use by subclasses.
*/
@property (readonly) NSString *content __attribute__((swift_name("content")));
@property (readonly) NSArray<SharedKtor_httpHeaderValueParam *> *parameters __attribute__((swift_name("parameters")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpContentType")))
@interface SharedKtor_httpContentType : SharedKtor_httpHeaderValueWithParameters
- (instancetype)initWithContentType:(NSString *)contentType contentSubtype:(NSString *)contentSubtype parameters:(NSArray<SharedKtor_httpHeaderValueParam *> *)parameters __attribute__((swift_name("init(contentType:contentSubtype:parameters:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithContent:(NSString *)content parameters:(NSArray<SharedKtor_httpHeaderValueParam *> *)parameters __attribute__((swift_name("init(content:parameters:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly, getter=companion) SharedKtor_httpContentTypeCompanion *companion __attribute__((swift_name("companion")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (BOOL)matchPattern:(SharedKtor_httpContentType *)pattern __attribute__((swift_name("match(pattern:)")));
- (BOOL)matchPattern_:(NSString *)pattern __attribute__((swift_name("match(pattern_:)")));
- (SharedKtor_httpContentType *)withParameterName:(NSString *)name value:(NSString *)value __attribute__((swift_name("withParameter(name:value:)")));
- (SharedKtor_httpContentType *)withoutParameters __attribute__((swift_name("withoutParameters()")));
@property (readonly) NSString *contentSubtype __attribute__((swift_name("contentSubtype")));
@property (readonly) NSString *contentType __attribute__((swift_name("contentType")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreChildHandle")))
@protocol SharedKotlinx_coroutines_coreChildHandle <SharedKotlinx_coroutines_coreDisposableHandle>
@required
- (BOOL)childCancelledCause:(SharedKotlinThrowable *)cause __attribute__((swift_name("childCancelled(cause:)")));
@property (readonly) id<SharedKotlinx_coroutines_coreJob> _Nullable parent __attribute__((swift_name("parent")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreChildJob")))
@protocol SharedKotlinx_coroutines_coreChildJob <SharedKotlinx_coroutines_coreJob>
@required
- (void)parentCancelledParentJob:(id<SharedKotlinx_coroutines_coreParentJob>)parentJob __attribute__((swift_name("parentCancelled(parentJob:)")));
@end

__attribute__((swift_name("KotlinSequence")))
@protocol SharedKotlinSequence
@required
- (id<SharedKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreSelectClause")))
@protocol SharedKotlinx_coroutines_coreSelectClause
@required
@property (readonly) id clauseObject __attribute__((swift_name("clauseObject")));
@property (readonly) SharedKotlinUnit *(^(^ _Nullable onCancellationConstructor)(id<SharedKotlinx_coroutines_coreSelectInstance>, id _Nullable, id _Nullable))(SharedKotlinThrowable *) __attribute__((swift_name("onCancellationConstructor")));
@property (readonly) id _Nullable (^processResFunc)(id, id _Nullable, id _Nullable) __attribute__((swift_name("processResFunc")));
@property (readonly) void (^regFunc)(id, id<SharedKotlinx_coroutines_coreSelectInstance>, id _Nullable) __attribute__((swift_name("regFunc")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreSelectClause0")))
@protocol SharedKotlinx_coroutines_coreSelectClause0 <SharedKotlinx_coroutines_coreSelectClause>
@required
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinKTypeProjection")))
@interface SharedKotlinKTypeProjection : SharedBase
- (instancetype)initWithVariance:(SharedKotlinKVariance * _Nullable)variance type:(id<SharedKotlinKType> _Nullable)type __attribute__((swift_name("init(variance:type:)"))) __attribute__((objc_designated_initializer));
@property (class, readonly, getter=companion) SharedKotlinKTypeProjectionCompanion *companion __attribute__((swift_name("companion")));
- (SharedKotlinKTypeProjection *)doCopyVariance:(SharedKotlinKVariance * _Nullable)variance type:(id<SharedKotlinKType> _Nullable)type __attribute__((swift_name("doCopy(variance:type:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) id<SharedKotlinKType> _Nullable type __attribute__((swift_name("type")));
@property (readonly) SharedKotlinKVariance * _Nullable variance __attribute__((swift_name("variance")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpURLBuilder.Companion")))
@interface SharedKtor_httpURLBuilderCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpURLBuilderCompanion *shared __attribute__((swift_name("shared")));
@end

__attribute__((swift_name("Ktor_httpParametersBuilder")))
@protocol SharedKtor_httpParametersBuilder <SharedKtor_utilsStringValuesBuilder>
@required
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpURLProtocol.Companion")))
@interface SharedKtor_httpURLProtocolCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpURLProtocolCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_httpURLProtocol *)createOrDefaultName:(NSString *)name __attribute__((swift_name("createOrDefault(name:)")));
@property (readonly) SharedKtor_httpURLProtocol *HTTP __attribute__((swift_name("HTTP")));
@property (readonly) SharedKtor_httpURLProtocol *HTTPS __attribute__((swift_name("HTTPS")));
@property (readonly) SharedKtor_httpURLProtocol *SOCKS __attribute__((swift_name("SOCKS")));
@property (readonly) SharedKtor_httpURLProtocol *WS __attribute__((swift_name("WS")));
@property (readonly) SharedKtor_httpURLProtocol *WSS __attribute__((swift_name("WSS")));
@property (readonly) NSDictionary<NSString *, SharedKtor_httpURLProtocol *> *byName __attribute__((swift_name("byName")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHeaderValueParam")))
@interface SharedKtor_httpHeaderValueParam : SharedBase
- (instancetype)initWithName:(NSString *)name value:(NSString *)value __attribute__((swift_name("init(name:value:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithName:(NSString *)name value:(NSString *)value escapeValue:(BOOL)escapeValue __attribute__((swift_name("init(name:value:escapeValue:)"))) __attribute__((objc_designated_initializer));
- (SharedKtor_httpHeaderValueParam *)doCopyName:(NSString *)name value:(NSString *)value escapeValue:(BOOL)escapeValue __attribute__((swift_name("doCopy(name:value:escapeValue:)")));
- (BOOL)isEqual:(id _Nullable)other __attribute__((swift_name("isEqual(_:)")));
- (NSUInteger)hash __attribute__((swift_name("hash()")));
- (NSString *)description __attribute__((swift_name("description()")));
@property (readonly) BOOL escapeValue __attribute__((swift_name("escapeValue")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) NSString *value __attribute__((swift_name("value")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpHeaderValueWithParameters.Companion")))
@interface SharedKtor_httpHeaderValueWithParametersCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpHeaderValueWithParametersCompanion *shared __attribute__((swift_name("shared")));
- (id _Nullable)parseValue:(NSString *)value init:(id _Nullable (^)(NSString *, NSArray<SharedKtor_httpHeaderValueParam *> *))init __attribute__((swift_name("parse(value:init:)")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Ktor_httpContentType.Companion")))
@interface SharedKtor_httpContentTypeCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKtor_httpContentTypeCompanion *shared __attribute__((swift_name("shared")));
- (SharedKtor_httpContentType *)parseValue:(NSString *)value __attribute__((swift_name("parse(value:)")));
@property (readonly) SharedKtor_httpContentType *Any __attribute__((swift_name("Any")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreParentJob")))
@protocol SharedKotlinx_coroutines_coreParentJob <SharedKotlinx_coroutines_coreJob>
@required
- (SharedKotlinCancellationException *)getChildJobCancellationCause __attribute__((swift_name("getChildJobCancellationCause()")));
@end

__attribute__((swift_name("Kotlinx_coroutines_coreSelectInstance")))
@protocol SharedKotlinx_coroutines_coreSelectInstance
@required
- (void)disposeOnCompletionDisposableHandle:(id<SharedKotlinx_coroutines_coreDisposableHandle>)disposableHandle __attribute__((swift_name("disposeOnCompletion(disposableHandle:)")));
- (void)selectInRegistrationPhaseInternalResult:(id _Nullable)internalResult __attribute__((swift_name("selectInRegistrationPhase(internalResult:)")));
- (BOOL)trySelectClauseObject:(id)clauseObject result:(id _Nullable)result __attribute__((swift_name("trySelect(clauseObject:result:)")));
@property (readonly) id<SharedKotlinCoroutineContext> context __attribute__((swift_name("context")));
@end


/**
 * @note annotations
 *   kotlin.SinceKotlin(version="1.1")
*/
__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinKVariance")))
@interface SharedKotlinKVariance : SharedKotlinEnum<SharedKotlinKVariance *>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@property (class, readonly) SharedKotlinKVariance *invariant __attribute__((swift_name("invariant")));
@property (class, readonly) SharedKotlinKVariance *in __attribute__((swift_name("in")));
@property (class, readonly) SharedKotlinKVariance *out __attribute__((swift_name("out")));
+ (SharedKotlinArray<SharedKotlinKVariance *> *)values __attribute__((swift_name("values()")));
@property (class, readonly) NSArray<SharedKotlinKVariance *> *entries __attribute__((swift_name("entries")));
@end

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinKTypeProjection.Companion")))
@interface SharedKotlinKTypeProjectionCompanion : SharedBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
@property (class, readonly, getter=shared) SharedKotlinKTypeProjectionCompanion *shared __attribute__((swift_name("shared")));

/**
 * @note annotations
 *   kotlin.jvm.JvmStatic
*/
- (SharedKotlinKTypeProjection *)contravariantType:(id<SharedKotlinKType>)type __attribute__((swift_name("contravariant(type:)")));

/**
 * @note annotations
 *   kotlin.jvm.JvmStatic
*/
- (SharedKotlinKTypeProjection *)covariantType:(id<SharedKotlinKType>)type __attribute__((swift_name("covariant(type:)")));

/**
 * @note annotations
 *   kotlin.jvm.JvmStatic
*/
- (SharedKotlinKTypeProjection *)invariantType:(id<SharedKotlinKType>)type __attribute__((swift_name("invariant(type:)")));
@property (readonly) SharedKotlinKTypeProjection *STAR __attribute__((swift_name("STAR")));
@end

#pragma pop_macro("_Nullable_result")
#pragma clang diagnostic pop
NS_ASSUME_NONNULL_END
