package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Motor;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.angora_nama), ctx.getString(R.string.angora_asal),
                ctx.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString( R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi),R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Motor>initDataMotor(Context ctx) {
        List<Motor> motors= new ArrayList<>();
        motors.add(new Motor(ctx.getString(R.string.yamaha_nama), ctx.getString(R.string.yamaha_asal),
                ctx.getString(R.string.yamaha_deskripsi), R.drawable.yamaha));
        motors.add(new Motor(ctx.getString(R.string.honda_nama), ctx.getString(R.string.honda_asal),
                ctx.getString(R.string.honda_deskripsi), R.drawable.honda));
        motors.add(new Motor(ctx.getString(R.string.ktm_nama), ctx.getString(R.string.ktm_asal),
                ctx.getString(R.string.ktm_deskripsi) , R.drawable.ktm));
        motors.add(new Motor(ctx.getString(R.string.ducati_nama), ctx.getString(R.string.ducati_asal),
                ctx.getString(R.string.ducati_deskripsi) , R.drawable.ducati));
        motors.add(new Motor(ctx.getString(R.string.petronas_nama), ctx.getString(R.string.petronas_asal),
                ctx.getString(R.string.petronas_deskripsi), R.drawable.petronas));
        motors.add(new Motor(ctx.getString(R.string.kawasaki_nama), ctx.getString(R.string.kawasaki_asal),
                ctx.getString(R.string.kawasaki_deskripsi), R.drawable.kawasaki));
        return motors;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataMotor(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
