<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tradient </title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon.png">
    <!-- Custom Stylesheet -->
    <link rel="stylesheet" href="./vendor/waves/waves.min.css">
    <link rel="stylesheet" href="./vendor/owlcarousel/css/owl.carousel.min.css">
    <link rel="stylesheet" href="./css/style.css">
</head>

<body class="dashboard">

    <div id="preloader">
        <div class="sk-three-bounce">
            <div class="sk-child sk-bounce1"></div>
            <div class="sk-child sk-bounce2"></div>
            <div class="sk-child sk-bounce3"></div>
        </div>
    </div>

    <div id="main-wrapper">

        <div class="header dashboard">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <nav class="navbar navbar-expand-lg navbar-light px-0">
                            <a class="navbar-brand" href="index.html"><img src="./images/w_logo.png" alt=""></a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>

                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav">
                                    <li class="nav-item">
                                        <a class="nav-link" href="index.html">Dashboard</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="buy-sell.html">Buy/Sell</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="accounts.html">Accounts</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="settings.html">Settings</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="dashboard_log my-2">
                                <div class="d-flex align-items-center">
                                    <div class="account_money">
                                        <ul>
                                            <li class="crypto">
                                                <span>0.0025</span>
                                                <i class="cc BTC-alt"></i>
                                            </li>
                                            <li class="usd">
                                                <span>19.93 USD</span>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="profile_log dropdown">
                                        <div class="user" data-toggle="dropdown">
                                            <span class="thumb"><i class="la la-user"></i></span>
                                            <span class="name">Maria Pascle</span>
                                            <span class="arrow"><i class="la la-angle-down"></i></span>
                                        </div>
                                        <div class="dropdown-menu dropdown-menu-right">
                                            <a href="accounts.html" class="dropdown-item">
                                                <i class="la la-user"></i> Account
                                            </a>
                                            <a href="history.html" class="dropdown-item">
                                                <i class="la la-book"></i> History
                                            </a>
                                            <a href="settings.html" class="dropdown-item">
                                                <i class="la la-cog"></i> Setting
                                            </a>
                                            <a href="lock.html" class="dropdown-item">
                                                <i class="la la-lock"></i> Lock
                                            </a>
                                            <a href="index.html" class="dropdown-item logout">
                                                <i class="la la-sign-out"></i> Logout
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>

        <div class="page_title section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="page_title-content">
                            <p>Welcome Back,
                                <span> Maria Pascle</span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="buy_sell mb-80">
            <div class="container">
                <div class="row">
                    <div class="col-xl-5 col-lg-5 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="buy-sell-widget">
                                    <ul class="nav nav-tabs">
                                        <li class="nav-item"><a class="nav-link active" data-toggle="tab" href="#buy">Buy</a>
                                        </li>
                                        <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#sell">Sell</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content tab-content-default">
                                        <div class="tab-pane fade show active" id="buy" role="tabpanel">
                                            <form>
                                                <div class="form-group">
                                                    <label class="mr-sm-2">Select your currency</label>
                                                    <div class="input-group mb-3">
                                                        <div class="input-group-prepend">
                                                            <label class="input-group-text"><i
                                                                    class="cc BTC-alt"></i></label>
                                                        </div>
                                                        <div class="drop-menu form-control">
                                                            <div class="select">
                                                                <span>Select Coin</span>
                                                                <i class="fa fa-angle-right"></i>
                                                            </div>
                                                            <ul class="dropeddown">
                                                                <li>Bitcoin</li>
                                                                <li>Litecoin</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="mr-sm-2">Select Payment Method</label>
                                                    <div class="input-group mb-3">
                                                        <div class="input-group-prepend">
                                                            <label class="input-group-text"><i
                                                                    class="fa fa-bank"></i></label>
                                                        </div>
                                                        <div class="drop-menu form-control">
                                                            <div class="select">
                                                                <span>Select Account</span>
                                                                <i class="fa fa-angle-right"></i>
                                                            </div>
                                                            <ul class="dropeddown">
                                                                <li>Bank of America ********45845</li>
                                                                <li>Master Card ***********5458</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="mr-sm-2">Enter your amount</label>
                                                    <div class="input-group">
                                                        <input type="text" aria-label="First name" class="form-control" value="0.0214 BTC">
                                                        <input type="text" aria-label="Last name" class="form-control" value="125.00 USD">
                                                    </div>
                                                    <div class="d-flex justify-content-between mt-2">
                                                        <p>Monthly Limit</p>
                                                        <h5>$49750 remaining</h5>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <button class="btn btn-success btn-block">Buy</button>
                                                </div>

                                            </form>
                                        </div>
                                        <div class="tab-pane fade" id="sell">
                                            <form>
                                                <div class="form-group">
                                                    <label class="mr-sm-2">Select your currency</label>
                                                    <div class="input-group mb-3">
                                                        <div class="input-group-prepend">
                                                            <label class="input-group-text"><i
                                                                    class="cc BTC"></i></label>
                                                        </div>
                                                        <div class="drop-menu form-control">
                                                            <div class="select">
                                                                <span>Select Coin</span>
                                                                <i class="fa fa-angle-right"></i>
                                                            </div>
                                                            <ul class="dropeddown">
                                                                <li>Bitcoin</li>
                                                                <li>Litecoin</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="mr-sm-2">Select Payment Method</label>
                                                    <div class="input-group mb-3">
                                                        <div class="input-group-prepend">
                                                            <label class="input-group-text"><i
                                                                    class="fa fa-bank"></i></label>
                                                        </div>
                                                        <div class="drop-menu form-control">
                                                            <div class="select">
                                                                <span>Select Account</span>
                                                                <i class="fa fa-angle-right"></i>
                                                            </div>
                                                            <input type="hidden" name="gender">
                                                            <ul class="dropeddown">
                                                                <li>Bank of America ********45845</li>
                                                                <li>Master Card ***********5458</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="mr-sm-2">Enter your amount</label>
                                                    <div class="input-group">
                                                        <input type="text" aria-label="First name" class="form-control" value="0.0214 BTC">
                                                        <input type="text" aria-label="Last name" class="form-control" value="125.00 USD">
                                                    </div>
                                                    <div class="d-flex justify-content-between mt-2">
                                                        <p>Monthly Limit</p>
                                                        $49750 remaining
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <button class="btn btn-success btn-block">Buy</button>
                                                </div>

                                            </form>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="col-xl-7 col-lg-7 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="buyer-seller">
                                    <div class="d-flex justify-content-between mb-3">
                                        <div class="buyer-info">
                                            <div class="media">
                                                <img class="mr-3" src="./images/profile/2.png" alt="" width="50">
                                                <div class="media-body">
                                                    <h4>Buyer</h4>
                                                    <h5>Michael John</h5>
                                                    <a href="#">hello@example.com</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="seller-info text-right">
                                            <div class="media">
                                                <div class="media-body">
                                                    <h4>Seller</h4>
                                                    <h5>John Doe</h5>
                                                    <a href="#">hello@example.com</a>
                                                </div>
                                                <img class="ml-3" src="./images/profile/1.png" alt="" width="50">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <tbody>
                                                <tr>
                                                    <td><span class="text-primary">You are selling</span></td>
                                                    <td><span class="text-primary">0.00254 BTC</span></td>
                                                </tr>
                                                <tr>
                                                    <td>Payment Method</td>
                                                    <td>Bank of America Bank ***********5245</td>
                                                </tr>
                                                <tr>
                                                    <td>Exchange Rate</td>
                                                    <td>0.00212455 BTC</td>
                                                </tr>
                                                <tr>
                                                    <td>Fee</td>
                                                    <td>$28.00 USD</td>
                                                </tr>
                                                <tr>
                                                    <td>Total</td>
                                                    <td>$854.00 USD</td>
                                                </tr>
                                                <tr>
                                                    <td>Vat</td>
                                                    <td>
                                                        <div class="text-danger">$25.00 USD</div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td> Sub Total</td>
                                                    <td> $1232.00 USD</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-xl-6 col-xxl-12">
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">FAQ</h4>
                            </div>
                            <div class="card-body">
                                <div id="accordion-faq" class="accordion">
                                    <div class="card">
                                        <div class="card-header">
                                            <h5 class="mb-0 collapsed c-pointer" data-toggle="collapse" data-target="#collapseOne1" aria-expanded="false" aria-controls="collapseOne1"><i class="fa" aria-hidden="true"></i>What Shipping Methods are Available?</h5>
                                        </div>
                                        <div id="collapseOne1" class="collapse show" data-parent="#accordion-faq">
                                            <div class="card-body">Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <h5 class="mb-0 collapsed c-pointer" data-toggle="collapse" data-target="#collapseTwo2" aria-expanded="false" aria-controls="collapseTwo2"><i class="fa" aria-hidden="true"></i>How Long Will it Take To Get My Package?</h5>
                                        </div>
                                        <div id="collapseTwo2" class="collapse" data-parent="#accordion-faq">
                                            <div class="card-body">Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <h5 class="mb-0 collapsed c-pointer" data-toggle="collapse" data-target="#collapseThree3" aria-expanded="false" aria-controls="collapseThree3"><i class="fa" aria-hidden="true"></i>How Do I Track My Order?</h5>
                                        </div>
                                        <div id="collapseThree3" class="collapse" data-parent="#accordion-faq">
                                            <div class="card-body">Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <h5 class="mb-0 collapsed c-pointer" data-toggle="collapse" data-target="#collapseThree4" aria-expanded="false" aria-controls="collapseThree4"><i class="fa" aria-hidden="true"></i>Do I Need A Account To Place Order?</h5>
                                        </div>
                                        <div id="collapseThree4" class="collapse" data-parent="#accordion-faq">
                                            <div class="card-body">Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card">
                                        <div class="card-header">
                                            <h5 class="mb-0 collapsed c-pointer" data-toggle="collapse" data-target="#collapseThree5" aria-expanded="false" aria-controls="collapseThree5"><i class="fa" aria-hidden="true"></i>How do I Place an Order?</h5>
                                        </div>
                                        <div id="collapseThree5" class="collapse" data-parent="#accordion-faq">
                                            <div class="card-body">Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-6">
                        <div class="intro-video-play">
                            <div class="play-btn">
                                <span><i class="fa fa-play"></i></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="footer">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-6">
                        <div class="copy_right">
                            Copyright © 2019 Quixlab. All Rights Reserved.
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-6 text-lg-right text-center">
                        <div class="social">
                            <a href="#"><i class="fa fa-youtube-play"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-facebook"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <script src="./vendor/jquery/jquery.min.js"></script>
    <script src="./vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="./vendor/waves/waves.min.js"></script>
    <script src="./js/scripts.js"></script>
</body>

</html>