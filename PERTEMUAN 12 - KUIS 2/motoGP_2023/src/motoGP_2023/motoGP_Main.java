package motoGP_2023;
import java.util.Scanner;

public class motoGP_Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL_motoGP23 motoGP = new SLL_motoGP23();

        //Afifah's assignment
        //Please ask my permission if u use my code

        // Informasi: 
        // Total ada 42 Pertandingan MotoGP dalam satu musim, masing2 diadakan di hari sabtu dan minggu. 
        // Untuk Pertandingan hari Sabtu, poinnya berkisar dari 1-12 (Biasa disebut dengan Sprint)
        // Untuk Pertandingan hari Minggu, Poinnya berkisar dari 1-25 
        // Dalam Tugas kali ini, saya menggunakan 10 sampel pertandingan, dan saya menggunakan hari Minggu 

        // 1. Sirkuit Autodromo Internacional Do Algarve - Portugis (24 Maret 2023 - 26 Maret 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 25, 2485.695, 9.294, 165.6, 7, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 25, 2507.124, 21.723, 164.8, 3, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 25, 2413.526, 8.125, 165.7, 11, "Aprilia");
        motoGP.addFirst("A. Rins", "TEAM LCR", 25, 2496.992, 11.591, 165.5, 6, "Honda");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 25, 2413.648, 8.247, 165.7, 10, "KTM");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 25, 2512.451, 27.050, 164.4, 2, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 25, 2413.944, 8.543, 165.7, 8, "Yamaha");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 25, 2502.393, 16.992, 165.1, 5, "Honda");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 25, 2413.782, 8.381, 165.7, 9, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 25, 2418.461, 8.060, 165.7, 13, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 21, 2095.565, 4.000, 165.6, 0, "Ducati");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 25, 2508.127, 2.726, 166.1, 16, "Ducati");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 2, 202.193, 23.000, 163.5, 0, "Yamaha");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 25, 2486.088, 0.687, 166.2, 20, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 23, 2305.714, 2.000, 164.9, 0, "Yamaha");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 25, 2485.401, 0.000, 166.2, 25, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 10, 1035.321, 15.000, 159.6, 0, "Aprilia");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 25, 2502.849, 17.448, 165.1, 4, "Honda");
        motoGP.addFirst("M. Marquez", "REPSOL HONDA TEAM", 2, 202.416, 23.000, 163.3, 0, "Honda");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 19, 1895.787, 6.000, 165.6, 0, "Ducati");

        //2. Sirkuit Termas De Rio Hondo - Argentina (31 Maret 2023 - 2 April 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 25, 2704.701, 36.183, 159.9, 1, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 25, 2687.898, 19.380, 160.9, 5, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 25, 2713.199, 4.681, 161.8, 16, "Aprilia");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 25, 2716.624, 48.106, 159.2, 0, "KTM");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 25, 2716.271, 47.753, 159.2, 0, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 25, 2687.033, 18.515, 160.9, 6, "Aprilia");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 25, 2676.099, 7.581, 161.6, 13, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 25, 2679.613, 11.095, 161.4, 9, "Yamaha");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 25, 2678.264, 9.746, 161.5, 11, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 25, 2679.080, 10.562, 161.4, 10, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 25, 2672.603, 4.085, 161.8, 20, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 25, 2682.212, 13.694, 161.2, 8, "Ducati");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 25, 2668.518, 0.000, 162.0, 25, "Ducati");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 25, 2694.609, 26.091, 160.5, 4, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 25, 2698.412, 29.894, 160.2, 2, "Yamaha");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 25, 2696.912, 28.394, 160.3, 3, "Honda");

        // 3. Circuit Of Americas - USA (14 April 2023 - 16 April 2023)
        motoGP.addFirst("A. Fernandez", "TECH 3", 20, 2502.866, 28.217, 158.5, 6, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 0, 0, 0, 0, 0, "Aprilia");
        motoGP.addFirst("A. Rins", "TEAM LCR", 20, 2474.649, 0.000, 160.4, 25, "Honda");
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 0, 0, 0, 0, 0, "Aprilia");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 20, 2557.661, 83.012, 155.1, 3, "KTM");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 7, 865.337, 13.000, 160.5, 0, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 20, 2502.630, 27.981, 158.6, 7, "Aprilia");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 20, 2495.048, 20.399, 159.0, 8, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 20, 2479.585, 4.936, 160.0, 16, "Yamaha");
        motoGP.addFirst("J. Folger", "TECH 3", 20, 2542.714, 68.065, 156.1, 4, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 0, 0, 0, 0, 0, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 6, 743.426, 14.000, 160.1, 0, "KTM");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 8, 999.616, 12.000, 158.8, 0, "Honda");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 20, 2506.891, 12.242, 159.6, 9, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 20, 2478.147, 3.498, 160.1, 20, "Ducati");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 20, 2506.698, 12.049, 159.6, 10, "Ducati");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 20, 2484.638, 9.989, 159.7, 11, "Yamaha");
        motoGP.addFirst("M. Pirro", "DUCATI TEAM", 20, 2507.019, 32.370, 158.3, 5, "Ducati");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 20, 2496.967, 8.318, 159.8, 13, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 6, 783.932, 14.000, 151.9, 0, "Yamaha");
        motoGP.addFirst("S. Bradl", "REPSOL HONDA TEAM", 18, 2253.252, 2.000, 158.5, 0, "Honda");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 11, 1374.557, 9.000, 158.8, 0, "Honda");

        //4. Circuito De Jerez Angel Nieto - Spanyol (28 April 2023 - 30 April 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 24, 2373.845, 4.760, 160.9, 11, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 24, 2388.095, 19.010, 160.0, 3, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 24, 2384.037, 14.952, 160.2, 8, "Aprilia");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 24, 2369.306, 0.221, 161.2, 20, "KTM");
        motoGP.addFirst("D. Pedrosa", "RED BULL KTM FACTORY RACING", 24, 2375.456, 6.371, 160.8, 9, "KTM");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 24, 2369.085, 0.000, 161.3, 25, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 24, 2386.996, 17.911, 160.0, 4, "Aprilia");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 24, 2386.294, 17.209, 160.1, 5, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 24, 2384.931, 15.846, 160.2, 6, "Yamaha");
        motoGP.addFirst("I. Lecuona", "REPSOL HONDA TEAM", 24, 2405.838, 36.753, 158.8, 0, "Honda");
        motoGP.addFirst("J. Folger", "TECH 3", 24, 2416.231, 47.146, 158.1, 0, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 24, 2371.027, 1.942, 161.1, 13, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 24, 2370.204, 1.119, 161.2, 16, "KTM");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 1, 108.333, 23.000, 146.9, 0, "Honda");
        motoGP.addFirst("L. Marini", "TEAM VR46", 24, 2375.414, 6.329, 160.8, 10, "Ducati");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 16, 1589.418, 8.000, 160.2, 0, "Ducati");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 0, 0, 0, 0, 0, "Yamaha");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 23, 2279.422, 1.000, 160.6, 0, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 24, 2405.456, 36.371, 158.8, 1, "Yamaha");
        motoGP.addFirst("S. Bradl", "HONDA WORLD SUPERBIKE TEAM", 24, 2396.379, 27.294, 159.4, 2, "Honda");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 24, 2384.777, 15.692, 160.2, 7, "Honda");
        motoGP.addFirst("A. Rins", "TEAM LCR", 2, 237.849, 22.000, 133.8, 0, "Honda");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 16, 1584.180, 8.000, 160.8, 0, "Ducati");

        //5. Sirkuit Le Mans - Perancis (12 Mei 2023 - 14 Mei 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 27, 2504.696, 6.726, 162.4, 11, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 27, 2504.251, 6.281, 162.4, 13, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 5, 468.562, 22.000, 160.7, 0, "Ducati");
        motoGP.addFirst("A. Rins", "TEAM LCR", 14, 1305.695, 13.000, 161.5, 0, "Honda");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 27, 2511.608, 13.638, 161.9, 10, "KTM");
        motoGP.addFirst("D. Petrucci", "DUCATI TEAM", 27, 2527.705, 29.735, 160.9, 5, "Ducati");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 4, 375.137, 23.000, 160.6, 0, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 27, 2513.796, 15.826, 161.8, 8, "Ducati");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 27, 2515.798, 17.828, 161.6, 6, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 27, 2512.993, 15.023, 161.8, 9, "Yamaha");
        motoGP.addFirst("J. Folger", "TECH 3", 27, 2547.778, 49.808, 159.6, 3, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 27, 2502.226, 4.256, 162.5, 20, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 24, 2228.498, 3.000, 162.2, 0, "KTM");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 12, 1132.266, 15.000, 159.6, 0, "Honda");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 27, 2502.765, 4.795, 162.5, 16, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 5, 468.184, 22.000, 160.8, 0, "Ducati");
        motoGP.addFirst("L. Savadori", "RNF RACING", 27, 2534.105, 36.135, 160.5, 4, "Aprilia");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 27, 2497.970, 0.000, 162.8, 25, "Ducati");
        motoGP.addFirst("M. Marquez", "REPSOL HONDA TEAM", 25, 2317.068, 2.000, 162.5, 0, "Honda");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 4, 375.475, 23.000, 160.5, 0, "Aprilia");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 27, 2514.340, 16.370, 161.7, 7, "Honda");

        //6. Sirkuit AutoDromo Internazionale Del Mugello - Italia (9 Juni - 11 Juni 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 23, 2487.771, 10.908, 174.5, 10, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 23, 2503.363, 26.500, 173.4, 1, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 14, 1508.548, 9.000, 175.2, 0, "Ducati");
        motoGP.addFirst("A. Rins", "TEAM LCR", 0, 0.0, 0.000, 0.0, 0, "Honda");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 23, 2495.788, 8.925, 174.7, 11, "KTM");
        motoGP.addFirst("E. Bastianini", "DUCATI TEAM", 23, 2513.965, 17.102, 174.1, 7, "Ducati");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 23, 2476.863, 0.000, 175.3, 25, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 23, 2502.769, 25.906, 173.5, 2, "Ducati");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 23, 2506.473, 17.610, 174.0, 6, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 23, 2506.724, 17.861, 174.0, 5, "Yamaha");
        motoGP.addFirst("J. Folger", "TECH 3", 23, 2555.775, 78.912, 169.9, 0, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 23, 2477.930, 1.067, 175.2, 20, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 23, 2487.862, 10.999, 174.5, 9, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 23, 2478.840, 1.977, 175.1, 16, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 23, 2494.488, 4.625, 175.0, 13, "Ducati");
        motoGP.addFirst("L. Savadori", "APRILIA RACING TEAM", 23, 2515.525, 38.662, 172.6, 0, "Aprilia");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 23, 2489.517, 12.654, 174.4, 8, "Ducati");
        motoGP.addFirst("M. Marquez", "REPSOL HONDA TEAM", 5, 542.151, 18.000, 174.1, 0, "Honda");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 10, 1085.538, 13.000, 173.9, 0, "Aprilia");
        motoGP.addFirst("M. Pirro", "DUCATI TEAM", 23, 2507.013, 30.150, 173.2, 0, "Ducati");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 23, 2495.973, 19.110, 173.9, 4, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 23, 2514.864, 38.001, 172.6, 0, "Aprilia");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 23, 2498.810, 21.947, 173.7, 3, "Honda");

        //7. Sirkuit Sachsenring - Jerman (16 Juni 2023 - 18 Juni 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 30, 2480.992, 28.543, 159.8, 0, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 30, 2472.446, 19.997, 160.3, 5, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 30, 2466.489, 14.040, 160.7, 9, "Ducati");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 18, 1473.572, 12.000, 161.4, 0, "KTM");
        motoGP.addFirst("E. Bastianini", "DUCATI TEAM", 30, 2467.308, 14.859, 160.6, 8, "Ducati");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 30, 2452.513, 0.064, 161.6, 20, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 30, 2471.510, 17.061, 160.5, 7, "Ducati");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 30, 2475.398, 22.949, 160.1, 4, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 30, 2477.566, 25.117, 160.0, 3, "Yamaha");
        motoGP.addFirst("J. Folger", "TECH 3", 30, 2501.411, 48.962, 158.4, 0, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 30, 2452.449, 0.000, 161.6, 25, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 30, 2464.353, 11.904, 160.8, 10, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 30, 2459.462, 7.013, 161.2, 16, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 30, 2464.128, 11.679, 160.8, 11, "Ducati");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 30, 2460.879, 8.430, 161.1, 13, "Ducati");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 30, 2472.097, 19.648, 160.3, 6, "Aprilia");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 8, 681.340, 22.000, 155.1, 0, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 30, 2472.952, 25.503, 159.9, 1, "Aprilia");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 30, 2477.776, 25.327, 160.0, 2, "Honda");

        //8. Curcuit Assen - Belanda(23 Juni - 25 Juni)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 26, 2439.565, 1.925, 174.2, 16, "Aprilia");
        motoGP.addFirst("A. Fernandez", "TECH 3", 26, 2471.376, 33.736, 172.0, 6, "KTM");
        motoGP.addFirst("A. Marquez", "GRESINI RACING", 26, 2450.077, 12.437, 173.5, 10, "Ducati");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 26, 2439.168, 1.528, 174.2, 13, "KTM");
        motoGP.addFirst("E. Bastianini", "DUCATI TEAM", 6, 572.489, 20.000, 171.3, 0, "Ducati");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 26, 2437.640, 0.000, 174.4, 25, "Ducati");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 18, 1702.457, 8.000, 172.8, 0, "Ducati");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 26, 2466.975, 29.335, 172.3, 7, "Yamaha");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 2, 196.275, 24.000, 166.6, 0, "Yamaha");
        motoGP.addFirst("I. Lecuona", "REPSOL HONDA TEAM", 14, 1354.010, 12.000, 169.0, 0, "Honda");
        motoGP.addFirst("J. Folger", "TECH 3", 26, 2483.249, 45.609, 171.1, 2, "KTM");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 26, 2439.574, 1.934, 174.2, 11, "Ducati");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 1, 100.963, 25.000, 161.9, 0, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 2, 196.449, 24.000, 166.4, 0, "Ducati");
        motoGP.addFirst("L. Marini", "TEAM VR46", 26, 2451.814, 14.174, 173.3, 9, "Ducati");
        motoGP.addFirst("L. Savadori", "APRILIA RACING TEAM", 26, 2472.724, 35.084, 171.9, 5, "Aprilia");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 26, 2438.863, 1.223, 174.3, 20, "Ducati");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 12, 1149.837, 14.000, 170.6, 0, "Aprilia");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 3, 288.675, 23.000, 169.9, 0, "Aprilia");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 26, 2477.262, 39.622, 171.6, 4, "Aprilia");
        motoGP.addFirst("S. Bradl", "TEAM LCR", 26, 2480.144, 42.504, 171.4, 3, "Honda");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 26, 2452.256, 14.616, 173.3, 8, "Honda");

        // 9. Sirkuit Mobility Resort Motegi - Jepang (29 September 2023 - 1 Oktober 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 12, 24.495, 3.181, 143.0, 11, "APRILIA");
        motoGP.addFirst("A. Fernandez", "TECH 3", 12, 24.901, 7.587, 142.6, 9, "KTM");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 5, 10.159, 420.0, 136.9, 0, "KTM");
        motoGP.addFirst("C. Crutchlow", "YAMAHA FACTORY RACING", 12, 24.371, 16.057, 141.8, 3, "YAMAHA");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 12, 24.727, 1.413, 143.2, 20, "DUCATI");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 12, 24.916, 8.602, 142.5, 8, "DUCATI");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 12, 25.248, 74.934, 136.3, 0, "YAMAHA");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 12, 24.558, 12.244, 142.1, 6, "YAMAHA");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 12, 24.314, 0.0, 143.4, 25, "DUCATI");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 12, 24.238, 14.924, 141.9, 4, "HONDA");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 12, 24.151, 6.837, 142.7, 10, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 12, 24.505, 6.191, 142.7, 0, "DUCATI");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 12, 24.257, 2.943, 143.1, 13, "DUCATI");
        motoGP.addFirst("M. Marquez", "REPSOL HONDA TEAM", 12, 24.327, 2.013, 143.2, 16, "HONDA");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 11, 23.786, 132.1, 132.1, 0, "APRILIA");
        motoGP.addFirst("M. Pirro", "DUCATI TEAM", 12, 24.276, 33.962, 140.1, 0, "DUCATI");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 11, 25.371, 122.3, 122.3, 0, "APRILIA");
        motoGP.addFirst("P. Espargaro", "TECH 3", 12, 24.235, 24.921, 140.9, 1, "KTM");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 12, 24.543, 11.229, 142.2, 7, "APRILIA");
        motoGP.addFirst("S. Bradl", "TEAM LCR", 12, 24.567, 17.253, 141.7, 2, "HONDA");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 12, 24.028, 14.714, 141.9, 5, "HONDA");

        //10. Sirkuit Mandalika - Indonesia (13 Oktober 2023 - 15 Oktober 2023)
        motoGP.addFirst("A. Espargaro", "APRILIA RACING TEAM", 27, 41.050761, 30.468, 166.5, 6, "APRILIA");
        motoGP.addFirst("A. Fernandez", "TECH 3", 11, 17.08574, 16 * 60, 165.5, 0, "KTM");
        motoGP.addFirst("A. Rins", "TEAM LCR", 27, 41.042833, 22.540, 167.0, 7, "HONDA");
        motoGP.addFirst("B. Binder", "RED BULL KTM FACTORY RACING", 27, 41.031521, 11.228, 167.7, 10, "KTM");
        motoGP.addFirst("E. Bastianini", "DUCATI TEAM", 27, 41.032977, 12.684, 167.6, 8, "DUCATI");
        motoGP.addFirst("F. Bagnaia", "DUCATI TEAM", 27, 41.020293, 0.000, 168.5, 25, "DUCATI");
        motoGP.addFirst("F. Morbidelli", "YAMAHA FACTORY RACING", 23, 42.01195, 4 * 60, 141.2, 2, "YAMAHA");
        motoGP.addFirst("F. Quartararo", "YAMAHA FACTORY RACING", 27, 41.020726, 0.433, 168.5, 16, "YAMAHA");
        motoGP.addFirst("F. Di Giannantonio", "GRESINI RACING", 27, 41.027255, 6.962, 168.0, 13, "DUCATI");
        motoGP.addFirst("J. Martin", "PRAMAC RACING", 12, 18.21953, 15 * 60, 168.6, 0, "DUCATI");
        motoGP.addFirst("J. Marquez", "REPSOL HONDA TEAM", 7, 10.53463, 20 * 60, 165.8, 0, "HONDA");
        motoGP.addFirst("J. Mir", "REPSOL HONDA TEAM", 11, 17.01668, 16 * 60, 166.7, 0, "HONDA");
        motoGP.addFirst("J. Miller", "RED BULL KTM FACTORY RACING", 27, 41.032767, 12.474, 167.7, 9, "KTM");
        motoGP.addFirst("J. Zarco", "PRAMAC RACING", 14, 22.01941, 13 * 60, 163.9, 0, "DUCATI");
        motoGP.addFirst("L. Marini", "TEAM VR46", 4, 8.51542, 23 * 60, 116.5, 0, "DUCATI");
        motoGP.addFirst("M. Bezzecchi", "TEAM VR46", 27, 41.031404, 11.111, 167.7, 11, "DUCATI");
        motoGP.addFirst("M. Oliveira", "RNF RACING", 27, 41.93932, 36.639, 166.0, 4, "APRILIA");
        motoGP.addFirst("M. Viñales", "APRILIA RACING TEAM", 27, 41.020599, 0.306, 168.5, 20, "APRILIA");
        motoGP.addFirst("P. Espargaro", "TECH 3", 0, 0, 26 * 60, 155.9, 0, "KTM");
        motoGP.addFirst("R. Fernandez", "RNF RACING", 27, 42.03157, 42.864, 165.6, 3, "APRILIA");
        motoGP.addFirst("T. Nakagami", "TEAM LCR", 27, 41.851116, 30.823, 166.4, 5, "HONDA");  

        motoGP.sort("poin");
        motoGP.print();
        System.out.println();
        System.out.println("Keterangan: ");
        System.out.println("Waktu       = Rata-rata waktu yang dihabiskan dalam setiap pertandingan");
        System.out.println("Lap         = Total lap di keseluruhan pertandingan ");
        System.out.println("Interval    = Rata-rata interval waktu yang digunakan untuk setiap pertandingan");
        System.out.println("km_per_jam  = Rata-rata kecepatan yang digunakan dalam setiap pertandingan");
        System.out.println("Poin        = Total Poin dari seluruh pertandingan");
    }

}
