angular.module('webApp')
.config([ '$routeProvider', function($routeProvider) {
	$routeProvider
	.when('/', {
		templateUrl : 'resources/manuscript-core/index.html',
		controller : 'indexController'
	})
	.when('/registration', {
		templateUrl : 'resources/manuscript-core/template/registration.html',
		controller : 'registrationController'
	})

	.otherwise({
		redirectTo : '/index'
	});

} ]);